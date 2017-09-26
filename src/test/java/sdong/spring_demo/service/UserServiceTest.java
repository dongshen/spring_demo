package sdong.spring_demo.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sdong.spring_demo.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-datasources.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void doTest() {
		User user = new User();
		user.setName("李四");
		user.setSex("男");
		user.setCreateTime(new Date());
		boolean success = userService.insert(user);
		if (success) {
			System.out.println("保存数据成功");
		}
		userService.selectList().forEach(u -> System.out.println(u));
	}

}
