package com.sinocat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinocat.entity.Menu;
import com.sinocat.service.MenuService;

@Controller
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@ResponseBody
	@RequestMapping("/getMenus.action")
	public List<Menu> getMenus(){
		List<Menu> menus = menuService.getMenus();
		System.out.println(menus);
		return menus;
	}

}
