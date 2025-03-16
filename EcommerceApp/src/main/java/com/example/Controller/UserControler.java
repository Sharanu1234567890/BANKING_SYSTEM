package com.example.Controller;
import com.example.model.users;


import com.example.Service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserControler {
private final UserService userservice ;
public UserControler(UserService userservice ) {
	this.userservice=userservice;
}
@GetMapping
public List<users> getAllusers(){
	return userservice.getAllusers();
}
@PostMapping
public users createUsers(@RequestBody users user) {
	return userservice.createUsers(user);
}

}
