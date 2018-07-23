package com.sinocat.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinocat.entity.User;
import com.sinocat.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/findAll.action")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/register.action")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response, User user) {
		ModelAndView mv = new ModelAndView();
		
		boolean flag = userService.register(user);
		
		return mv;
	}

	@RequestMapping(value = "/login.action")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,String u_phone,String u_password, String rempwd){
		
		ModelAndView mv = new ModelAndView();
		User user = new User();
		user.setU_phone(u_phone);
		user.setU_password(u_password);
		List<User> list = userService.login(user);
		
		if(list.size()>0) {
			request.getSession().getServletContext().setAttribute(list.get(0).getU_phone(),list.get(0).getU_name() );
			request.getSession().setAttribute("user", list.get(0));
			request.getSession().setMaxInactiveInterval(30*60);
			if(rempwd!=null) {
				Cookie u_phoneCookie = new Cookie("u_phone",list.get(0).getU_phone());
				Cookie u_passwordCookie = new Cookie("u_password",list.get(0).getU_password());
				response.addCookie(u_phoneCookie);
				response.addCookie(u_passwordCookie);
				mv.setViewName("index");
			}
		}else {
			mv.setViewName("login");
			mv.addObject("message", "用户名或密码错误！");
		}
		
		return mv;
	}
	
	
}




























