package test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.PetService;
import service.UserService;



public class UserServiceTest {
	
	private UserService userService;
	private PetService petService;
	@Before
	public void before(){
		
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	userService=(UserService) ac.getBean("userServiceImpl");
	
	petService=(PetService)ac.getBean("petServiceImpl");
	}

	@Test
	public void showUnames(){
		System.out.println(userService.showUnames());
	}

	@Test
	public void login(){
		System.out.println(userService.login("18861821884", "mayu123"));
	}
	@Test
	public void register(){
		System.out.println(userService.register("18861821880", "mayu123","가가가가"));
	}
	@Test
	public void getMove(){
		System.out.println(petService.getMoveById(2));
	}
	
}
