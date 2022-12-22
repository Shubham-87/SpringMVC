package com.examples.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.example.models.User;
@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public int add(User user) {
		 entityManager.persist(user);
		 return 1;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
