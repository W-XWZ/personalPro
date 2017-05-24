package personalWEB.personalBlog;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.personal.domain.User;
import com.personal.service.IUserService;
import com.personal.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	private ApplicationContext ac = null;
	@Resource(name="userService")
	private UserServiceImpl userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
//		userService = (UserServiceImpl) ac.getBean("userService");
//	}

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
}
