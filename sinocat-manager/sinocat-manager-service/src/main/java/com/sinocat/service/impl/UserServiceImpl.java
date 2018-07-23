package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.sinocat.entity.User;
import com.sinocat.mapper.UserMapper;
import com.sinocat.service.UserService;

@Component
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	/**
	 * 查询所有用户信息
	 */
	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}

	/**
	 * 登录验证
	 */
	@Override
	public List<User> login(User user) {
		// TODO Auto-generated method stub
		return userMapper.login(user);
	}

	/**
	 * 用户注册、添加用户
	 */
	@Override
	public boolean register(User user) {
		int num = userMapper.addUser(user);
		if(num>0) {
			return true;
		}
		
		return false;
	}

	/**
	 * 根据手机号查询用户信息
	 */
	@Override
	public List<User> findUserByPhone(String Phone) {
		// TODO Auto-generated method stub
		return userMapper.findUserByPhone(Phone);
	}

	/**
	 * 在登录时忘记密码选项中
	 * 根据手机号验证修改密码
	 */
	@Override
	public int updatePasswordByPhone(User user) {
		// TODO Auto-generated method stub
		return userMapper.updatePasswordByPhone(user);
	}

	/**
	 * 在个人中心，根据用户id，修改用户信息
	 */
	@Override
	public int updateUserById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUserById(user);
	}

	/**
	 * 在个人中心修改密码
	 */
	@Override
	public int updatePasswordById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updatePasswordById(user);
	}



}