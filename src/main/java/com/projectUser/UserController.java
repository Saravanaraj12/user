package com.projectUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService us;
	@Autowired
	UserDetails ud;
	@PostMapping("/add")
	public String add(@RequestBody UserDetails u) {
	return us.add(u);
	
	}

}
