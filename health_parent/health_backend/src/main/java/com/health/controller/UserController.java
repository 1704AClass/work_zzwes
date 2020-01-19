package com.health.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Reference
	private UserService userService;
}
