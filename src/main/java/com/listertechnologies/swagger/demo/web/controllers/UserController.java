package com.listertechnologies.swagger.demo.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listertechnologies.swagger.demo.web.model.User;
import com.listertechnologies.swagger.demo.web.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/users")
@Api(value = "userrecords", description = "RestAPI to maintain the Users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	@ApiOperation(value = "Get all users")
	public List<User> list() {
		List<User> userList = userService.getAllUsers();
		return userList;
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get a user by Id", response = User.class)
	public ResponseEntity<User> getUser(@PathVariable Integer id) {
		User user = userService.getUser(id);
		if (user != null) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
	}
}
