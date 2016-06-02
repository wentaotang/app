import com.hgcode.domain.UserEntity;
import com.hgcode.mybatis.repository.UserRepository;
import com.hgcode.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.UncheckedIOException;

/**
 * Created by wentao on 2016/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/app-service.xml","/app-db.xml"})
public class ServiceTest {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private UserService userService;


    @Test
    @Transactional
    public void addTest() {
        UserEntity entity = new UserEntity();
        entity.setUserName("twt");
        userService.save(entity);
        try{
            int tmp=1/0;
         }catch (Exception e){
            e.printStackTrace();;
        }
        UserEntity entity1 = new UserEntity();
        entity1.setUserName("twt12");
        userService.save(entity1);
        System.out.println(entity1);
    }



}
