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
* @author ���� Zhang Liang:
* @version ����ʱ�䣺2018��5��1�� ����7:48:22
* ��˵��
*/
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private UserRepository userRepository;
	
	/**
	 * ��ѯ�û��б�
	 * @param model
	 * @return
	 */
	@GetMapping
	public ModelAndView list(Model model) {
		model.addAttribute("userList", userRepository.findAll());
		model.addAttribute("Title", "�û��б�");
		return new ModelAndView("users/list","userModel",model);
	}
	
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Long id,Model model) {
		model.addAttribute("user", userRepository.findById(id).get());
		model.addAttribute("Title", "�鿴�û�");
		return new ModelAndView("users/view","userModel",model);
	}
	
	/**
	 * �����û���
	 * @param model
	 * @return
	 */
	@GetMapping("/form")
	public ModelAndView createForm(Model model) {
		model.addAttribute("user", new User(null,null,null,null));
		model.addAttribute("Title", "�����û�");
		return new ModelAndView("users/form","userModel",model);
	}
	/**
	 * ���ӻ����޸��û�
	 * @param user
	 * @return
	 */
	
	@PostMapping
	public ModelAndView saveOrUpdateUser(User user,Model model) {
		user=userRepository.save(user);
		return new ModelAndView("redirect:/users");
	}
	
	/**
	 * ����idɾ���û�
	 * @param id
	 * @return
	 */
	@GetMapping("/delete/{id}")
	public ModelAndView deleteUser(@PathVariable("id") Long id) {
		userRepository.deleteById(id);;
		return new ModelAndView("redirect:/users");
	}
	
	/**
	 * ����id�޸��û�
	 * @param id
	 * @return
	 */
	@GetMapping("/modify/{id}")
	public ModelAndView getUser(@PathVariable("id") Long id,Model model) {
	   model.addAttribute("user", userRepository.findById(id).get());
	   model.addAttribute("Title", "�޸��û�");
	  return new ModelAndView("users/form","userModel",model);
	}
}
