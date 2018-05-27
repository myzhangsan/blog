package com.zl.blog.repository;
/**
* @author Zhang Liang:
* @version ����ʱ�䣺2018��5��1�� ����5:47:29
* ��˵��
*/



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zl.blog.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	/**
	 * �����û�������ҳģ����ѯ�û��б�
	 * @param name
	 * @param pageable
	 * @return
	 */
   Page<User> findByNameLike(String name,Pageable pageable);

   /**
    * �����û��˻���ѯ�û�
    * @param username
    * @return
    */
    User findUserByUsernameLike(String username);
}
