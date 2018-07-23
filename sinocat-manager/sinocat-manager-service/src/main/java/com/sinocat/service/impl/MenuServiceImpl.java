package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

import com.sinocat.entity.Menu;
import com.sinocat.mapper.MenuMapper;
import com.sinocat.service.MenuService;

public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	private RedisSerializer<String> redisSerializer = new Jackson2JsonRedisSerializer<>(String.class);

	@Override
	public List<Menu> getMenus() {
		redisTemplate.setKeySerializer(redisSerializer);
		List<Menu> menus = (List<Menu>) redisTemplate.opsForValue().get("Menus");

		if (menus == null) {
			synchronized (this) {
				menus = (List<Menu>) redisTemplate.opsForValue().get("Menus");
				if (menus == null) {
					menus = menuMapper.getMenus();
					redisTemplate.opsForValue().set("Menus", menus);
				}
			}
		}

		return menus;
	}

}
