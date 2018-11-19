package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import demo.controller.CRUD;
import demo.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootMybaitsApplicationTests {
	
	@Autowired
	private CRUD crud;
	
	@Test
	public void insertUser() {
		User user = new User();
		user.setId(100);
		user.setName("小张");
		user.setPassword("4566456");
		user.setEmail("1198987@qq.com");
		user.setRealname("张三");
		User user1 = crud.insert(user);
		System.out.println("添加成功"+user1.toString());
	}

	@Test
	public void deleteUser() {
		System.out.println(crud.delete(100));
	}

	@Test
	public void updateUser() {
		User user = new User();
		user.setId(663);
		user.setName("小李");
		user.setPassword("4512");
		user.setEmail("1142987@qq.com");
		user.setRealname("李四");
		String user2 = crud.update(user);
		System.out.println(user2);
	}
}
