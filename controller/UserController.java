package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("login")
	public String login(String uname, String password) {
		System.out.println(userService.login(uname, password));
		return "pokemon.jsp";
	}
}
