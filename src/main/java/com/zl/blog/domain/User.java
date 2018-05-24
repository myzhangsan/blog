package com.zl.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

/**
 * user实体
 * 
 * @author Administrator
 *
 */
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //自增策略
	private Long id;    //实体唯一标识
	@NotEmpty(message="姓名不能为空")
	@Size(min=2,max=20)
	@Column(nullable=false,length=20)
	private String name;
	
	@NotEmpty(message="邮箱不能为空")
	@Size(max=40)
	@Email(message="邮箱格式不对")
	@Column(nullable=true,length=40,unique=true)
	private String email;
	
	@NotEmpty(message="账户不能为空")
	@Size(min=6,max=50)
	@Column(nullable=false,length=50,unique=true)
	private String username;
	
	@NotEmpty(message="密码不能为空")
	@Size(max=50)
	@Column(length=100)
	private String password;
	
	@Column(length=100)
	private String avatar;  //头像
	 
	public User() {   //防止直接使用
		super();
	}

	public User(Long id, String name,String username, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username=username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return String.format("User[id=%d,name='%s',username='%s',email='%s']", id,name,username,email);
    }
}
