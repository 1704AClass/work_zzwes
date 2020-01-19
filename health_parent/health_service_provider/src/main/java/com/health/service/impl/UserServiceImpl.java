package com.health.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.health.mapper.TUserMapper;
import com.health.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private TUserMapper userMapper;
}
