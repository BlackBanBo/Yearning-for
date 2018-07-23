package com.sinocat.mapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.sinocat.entity.Image;
import com.sinocat.mapper.MogoMapper;

@Component
public class MogoMapperImpl implements MogoMapper {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<Image> findImages() {
		// TODO Auto-generated method stub
		List<Image> images = mongoTemplate.findAll(Image.class);
		System.out.println(images);
		return images;
	}

}
