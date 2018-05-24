package com.zl.blog.services;
/**
* @author ���� Zhang Liang:
* @version ����ʱ�䣺2018��5��24�� ����10:47:17
* �û�����ӿ�
*/

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zl.blog.domain.User;

public interface UserService {
  
	/**
	 * �������༭�������û�
	 * @param user
	 * @return
	 */
	User saveOrUpateUser(User user);
	
	/**
	 * ����idɾ���û�
	 * @param id
	 */
	void removeUser(Long id);
	
	/**
	 * ����id��ȡ�û�
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
     
	/**
	 * ����������ҳģ����ѯ
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<User> findUsersByNameLike(String name,Pageable pageable);
	
	/**
	 * �����û��˻���ѯuser
	 * @param userName
	 * @return
	 */
	User findUserByUserNameLike(String userName);
}
