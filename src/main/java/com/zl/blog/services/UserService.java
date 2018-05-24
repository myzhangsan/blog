package com.zl.blog.services;
/**
* @author 作者 Zhang Liang:
* @version 创建时间：2018年5月24日 下午10:47:17
* 用户服务接口
*/

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zl.blog.domain.User;

public interface UserService {
  
	/**
	 * 新增，编辑，保存用户
	 * @param user
	 * @return
	 */
	User saveOrUpateUser(User user);
	
	/**
	 * 根据id删除用户
	 * @param id
	 */
	void removeUser(Long id);
	
	/**
	 * 根据id获取用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
     
	/**
	 * 根据姓名分页模糊查询
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<User> findUsersByNameLike(String name,Pageable pageable);
	
	/**
	 * 根据用户账户查询user
	 * @param userName
	 * @return
	 */
	User findUserByUserNameLike(String userName);
}
