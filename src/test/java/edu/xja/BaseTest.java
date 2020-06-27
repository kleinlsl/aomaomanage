package edu.xja;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @project: ssm-learn1
 * @description:
 * @author: dell
 * @date: 2020/6/25 - 12:25
 * @version: 1.0
 * @website:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:spring-conf/springmvc.xml",
                "classpath:spring-conf/spring-mybatis.xml",
                "classpath:spring-conf/spring-tx.xml"
        }
    )
@WebAppConfiguration("web")
public class BaseTest {
}

