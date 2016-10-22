import com.hgcode.domain.UserEntity;
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
 

    @Test
    public void addTest(){
      UserEntity entity=new UserEntity();
        entity.setUserName("twt");
        System.out.println(entity);
    }

    @Test
    public void findByTest(){
        System.out.println("4rwrwerwerwer");
    }


}
