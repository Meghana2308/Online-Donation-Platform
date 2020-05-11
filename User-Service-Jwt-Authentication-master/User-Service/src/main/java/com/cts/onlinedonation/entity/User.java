package com.cts.onlinedonation.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="This is the User Model")
@Entity
@Table(name="Users")
public class User {

	@ApiModelProperty(value="A unique key for each User")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="u_Id")
	private Integer userId;
	@ApiModelProperty(value="User name for User")
	@Column(name="userName")
	private String userName;
	@ApiModelProperty(value="User password for User")
	@Column(name="password")
	private String password;
	@ApiModelProperty(value="User email for User")
	@Column(name="email")
	private String email;
	@ApiModelProperty(value="User email for User")
	@Column(name="location")
	private String loaction;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoaction() {
		return loaction;
	}

	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}

	public User(Integer userId, String userName, String password, String email, String loaction) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.loaction = loaction;
	}
	


	

	
}
