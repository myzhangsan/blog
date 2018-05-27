package com.zl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* @author ���� Zhang Liang:
* @version ����ʱ�䣺2018��5��22�� ����8:44:27
* ��˵��
* ��̨��ҳ
*/
@Controller
@RequestMapping("/admins")
public class AdminController {

	/**
	 * ��ȡ��̨����ҳ��
	 * @param model
	 * @return
	 */
	@GetMapping
	public ModelAndView listUsers(Model model) {
		return new ModelAndView("admin/index","menuList",model);
	}
	
}
