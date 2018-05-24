package com.zl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zl.blog.domain.User;
import com.zl.blog.repository.UserRepository;


/**
* @author 锟斤拷锟斤拷 Zhang Liang:
* @version 锟斤拷锟斤拷时锟戒：2018锟斤拷5锟斤拷1锟斤拷 锟斤拷锟斤拷7:48:22
* 锟斤拷说锟斤拷
*/
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private UserRepository userRepository;
	
	/**
	 * 查询用户列表
	 * @param model
	 * @return
	 */
	@GetMapping
	public ModelAndView list(Model model) {
		model.addAttribute("userList", userRepository.findAll());
		model.addAttribute("Title", "用户列表");
		return new ModelAndView("users/list","userModel",model);
	}
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Long id,Model model) {
		model.addAttribute("user", userRepository.findById(id).get());
		model.addAttribute("Title", "查看用户");
		return new ModelAndView("users/view","userModel",model);
	}
	
	/**
	 * 创建用户表单
	 * @param model
	 * @return
	 */
	@GetMapping("/form")
	public ModelAndView createForm(Model model) {
		model.addAttribute("user", new User(null,null,null,null));
		model.addAttribute("Title", "创建用户");
		return new ModelAndView("users/form","userModel",model);
	}
	/**
	 * 增加或者修改用户
	 * @param user
	 * @return
	 */
	
	@PostMapping
	public ModelAndView saveOrUpdateUser(User user,Model model) {
		user=userRepository.save(user);
		return new ModelAndView("redirect:/users");
	}
	
	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	@GetMapping("/delete/{id}")
	public ModelAndView deleteUser(@PathVariable("id") Long id) {
		userRepository.deleteById(id);;
		return new ModelAndView("redirect:/users");
	}
	
	/**
	 * 根据id修改用户
	 * @param id
	 * @return
	 */
	@GetMapping("/modify/{id}")
	public ModelAndView getUser(@PathVariable("id") Long id,Model model) {
	   model.addAttribute("user", userRepository.findById(id).get());
	   model.addAttribute("Title", "修改用户");
	  return new ModelAndView("users/form","userModel",model);
	}
}
