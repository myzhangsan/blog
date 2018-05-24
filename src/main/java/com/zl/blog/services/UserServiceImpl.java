package com.zl.blog.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zl.blog.domain.User;
import com.zl.blog.repository.UserRepository;

/**
 * @author ���� Zhang Liang:
 * @version ����ʱ�䣺2018��5��24�� ����10:57:13 �û�����ӿ�ʵ��
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
   //��ɾ��Ҫ���������
	@Transactional
	@Override
	public User saveOrUpateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	@Transactional
	@Override
	public void removeUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public Page<User> findUsersByNameLike(String name, Pageable pageable) {
		name = "%" + name + "%";
		return userRepository.findByNameLike(name, pageable);
	}

	@Override
	public User findUserByUserNameLike(String userName) {
		userName = "%" + userName + "%";
		return userRepository.findUserByUserNameLike(userName);
	}

}
