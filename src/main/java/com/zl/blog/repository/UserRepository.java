package com.zl.blog.repository;
/**
* @author Zhang Liang:
* @version 锟斤拷锟斤拷时锟戒：2018锟斤拷5锟斤拷1锟斤拷 锟斤拷锟斤拷5:47:29
* 锟斤拷说锟斤拷
*/



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zl.blog.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	/**
	 * 根据用户姓名分页模糊查询用户列表
	 * @param name
	 * @param pageable
	 * @return
	 */
   Page<User> findByNameLike(String name,Pageable pageable);

   /**
    * 根据用户账户查询用户
    * @param username
    * @return
    */
    User findUserByUsernameLike(String username);
}
