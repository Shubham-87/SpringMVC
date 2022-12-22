package com.examples.dao;

import java.util.List;

import com.example.models.User;

public interface UserRepository {

	public int add(User user);
	public List<User> getAllUsers();
}
