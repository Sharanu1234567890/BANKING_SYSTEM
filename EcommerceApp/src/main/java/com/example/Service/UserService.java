package com.example.Service;
import com.example.model.users;

import com.example.repository.Userepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
public class UserService {
	private final Userepository useRepository;
	 public UserService(Userepository useRepository) {
	        this.useRepository = useRepository;
	    }
	 public List<users> getAllusers(){
		 return useRepository.findAll();
	 }
	 public users createUsers(users users) {
		 return useRepository.save(users);
	 }
}
