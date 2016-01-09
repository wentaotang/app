import com.hgcode.domain.User;
import com.hgcode.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-db.xml")
public class DbTest {

    @Autowired
    private ApplicationContext applicationContext;



    @Test
    public void test1(){
        UserRepository userRepository=(UserRepository)applicationContext.getBean("userRepository");
        List<User> list=userRepository.selectAll();
        for(User user:list){
            System.out.println(user.getName());
        }
    }
}
