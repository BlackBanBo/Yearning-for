package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.sinocat.entity.Address;
import com.sinocat.mapper.AddressMapper;
import com.sinocat.service.AddressService;

@Component
@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressMapper addressMapper;

	@Override
	public int insert(Address address) {
		// TODO Auto-generated method stub
		return addressMapper.insert(address);
	}

	@Override
	public int update(Address address) {
		// TODO Auto-generated method stub
		return addressMapper.update(address);
	}

	@Override
	public int delete(Address address) {
		// TODO Auto-generated method stub
		return addressMapper.delete(address);
	}

	@Override
	public List<Address> findAll(String u_id) {
		// TODO Auto-generated method stub
		return addressMapper.findAll(u_id);
	}
	
	
}
