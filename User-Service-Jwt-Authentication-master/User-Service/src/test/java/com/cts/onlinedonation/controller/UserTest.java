package com.cts.onlinedonation.controller;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.onlinedonation.entity.User;
import com.cts.onlinedonation.repository.UserDao;
import com.cts.onlinedonation.service.UserService;






@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	@Autowired
	private UserService userService;
	@MockBean
	private UserDao userDao;

	@Test
	public void saveUserTest() {
		User user=new User(3,"John","john123","johnabraham@gmail.com","Hyderabad");
		when(userDao.save(user)).thenReturn(user);
		assertEquals(user,userService.addUser(user));
		
		
	}
	@Test
	public void findByEmailTest() {
		User user= new User(3,"John","john123","johnabraham@gmail.com","Hyderabad");
		when(userDao.findByEmail("johnabraham@123")).thenReturn(user);
		
	}
	
	}


