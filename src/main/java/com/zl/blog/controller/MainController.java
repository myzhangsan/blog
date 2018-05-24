package com.zl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ���� Zhang Liang:
 * @version ����ʱ�䣺2018��5��22�� ����8:03:05 ��˵��
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
		model.addAttribute("errorMsg", "��½ʧ��,�û��������������");
	   return "login";
	}
	
	//ע��ҳ��
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
