package com.sinocat.service;

import java.util.List;

import com.sinocat.entity.Address;

public interface AddressService {

    public int insert(Address address);
	
	public int update(Address address);
	
	public int delete(Address address);
	
	public List<Address> findAll(String u_id);
}
