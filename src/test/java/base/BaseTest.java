package base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载SpringIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({"classpath:applicationContext.xml","classpath:applicationContext-datasource.xml"})
public class BaseTest {

}

