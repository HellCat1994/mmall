import base.BaseTest;
import com.mmall.dao.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TEST1 extends BaseTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        System.out.println(12);
        int result = userMapper.deleteByPrimaryKey(1);
        System.out.println(result);
    }
}
