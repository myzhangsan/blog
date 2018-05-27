package com.zl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* @author 作者 Zhang Liang:
* @version 创建时间：2018年5月22日 下午8:44:27
* 类说明
* 后台首页
*/
@Controller
@RequestMapping("/admins")
public class AdminController {

	/**
	 * 获取后台管理页面
	 * @param model
	 * @return
	 */
	@GetMapping
	public ModelAndView listUsers(Model model) {
		return new ModelAndView("admin/index","menuList",model);
	}
	
}
