package com.zl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 作者 Zhang Liang:
* @version 创建时间：2018年5月22日 下午8:33:05
* 类说明
*/
@Controller
@RequestMapping("/blog")
public class BolgController {

	@GetMapping
	public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new") String order,
			               @RequestParam(value="keyword",required=false,defaultValue="") Long keyword) {
		System.out.println("order:"+order+",keyword:"+keyword);
		return "redirect:/index?order="+order+"&tag="+keyword;
	}
}
