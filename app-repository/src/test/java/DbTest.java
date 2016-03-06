import com.hgcode.vo.SexEnum;
import com.hgcode.domain.User;
import com.hgcode.repository.mybatis.UserRepository;
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

    private UserRepository userRepository;

    @Before
    public void before(){
        userRepository=(UserRepository)applicationContext.getBean("userRepository");
    }



    @Test
    public void test1(){

        List<User> list=userRepository.selectAll();
        for(User user:list){
            System.out.println(user.getName());
        }
    }

    @Test
    public void addTest(){
        User userEntity=new User();
        userEntity.setName("小乖3");
        userEntity.setSexEnum(SexEnum.FEMAL);
        userRepository.insert(userEntity);
    }

    @Test
    public void updateTest(){
        User userEntity=userRepository.selectByPrimaryKey(7);
        userEntity.setSexEnum(SexEnum.MALE);
        userRepository.updateByPrimaryKey(userEntity);
    }





}
