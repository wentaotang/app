import com.hgcode.domain.UserEntity;
import com.hgcode.mybatis.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wentao on 2016/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-db.xml")
public class DbTest {

    @Autowired
    private ApplicationContext applicationContext;

    private UserRepository userRepository;

    @Before
    public void before(){
        userRepository=(UserRepository)applicationContext.getBean("userRepository");
    }

    @Test
    public void addTest(){
      UserEntity entity=new UserEntity();
        entity.setUserName("twt");
        userRepository.insert(entity);
        System.out.println(entity);
    }

    @Test
    public void findByTest(){
        UserEntity userEntity=userRepository.selectByPrimaryKey(1);
        System.out.println(userEntity);
    }


}
