package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.sinocat.entity.Image;
import com.sinocat.mapper.MogoMapper;
import com.sinocat.service.MogoService;

@Service
@Component
public class MogoServiceImpl implements MogoService {
	
	@Autowired
	private MogoMapper mogoMapper;
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	private RedisSerializer<String> redisSerializer = new Jackson2JsonRedisSerializer<>(String.class);

	@Override
	public List<Image> findImages() {
		// TODO Auto-generated method stub
		redisTemplate.setKeySerializer(redisSerializer);
		List<Image> images = (List<Image>) redisTemplate.opsForValue().get("Images");
		
		if(images == null) {
			synchronized (this) {
				images = (List<Image>) redisTemplate.opsForValue().get("Images");
				if(images == null) {
					images = mogoMapper.findImages();
					redisTemplate.opsForValue().set("Images", images);
				}
			}
			
		}
		return images;
	}

}
