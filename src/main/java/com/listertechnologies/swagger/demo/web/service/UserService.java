package com.listertechnologies.swagger.demo.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.listertechnologies.swagger.demo.web.model.User;

@Service
public class UserService {

	private List<User> users = new ArrayList<User>() {
		{
			add(new User(1, "Jon", "Snow", "snow@winterfell.com"));
			add(new User(2, "Sam", "Tarly", "tarly@castleblack.com"));
			add(new User(3, "Arya", "Stark", "arya@winterfell.com"));
		}
	};

	public List<User> getAllUsers() {
		return users;
	}

	public User getUser(Integer id) {
		Optional<User> result = users.stream().filter(u -> u.getId().equals(id)).findFirst();
		User user = result.isPresent() ? result.get() : null;
		return user;
	}

}
