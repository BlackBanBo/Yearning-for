package com.sinocat.service;

import java.util.List;

import com.sinocat.entity.User;


public interface UserService {
	/**
	 * 查询所有用户数据
	 * @return
	 */
	public List<User> findAll();

	/**
	 * 登录验证
	 * @param user
	 * @return
	 */
	public List<User> login(User user);
	/**
	 * 根据手机号查询用户数据
	 * @param Phone
	 * @return
	 */
	public List<User> findUserByPhone(String Phone);
	/**
	 * 在登录时忘记密码选项中
	 * 根据手机号验证修改密码
	 * @param user
	 * @return
	 */
	public int updatePasswordByPhone(User user);
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int updateUserById(User user);
	/**
	 * 在个人中心修改密码
	 * @param password
	 * @param id
	 * @return
	 */
	public int updatePasswordById(User user);

	/**
	 * 注册
	 * @param user
	 * @return boolean
	 */
	public boolean register(User user);
}

	