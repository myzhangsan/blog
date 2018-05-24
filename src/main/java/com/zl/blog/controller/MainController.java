package com.zl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 作者 Zhang Liang:
 * @version 创建时间：2018年5月22日 下午8:03:05 类说明
 */
@Controller
public class MainController {

	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}
    
	@GetMapping("/login")
	public String login() {
		 return "login";
	}
	
	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		model.addAttribute("errorMsg", "登陆失败,用户名或者密码错误");
	   return "login";
	}
	
	//注册页面
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
