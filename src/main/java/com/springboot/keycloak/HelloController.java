package com.springboot.keycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/public/hello")
	public ResponseEntity<String> helloPublic() {
		return ResponseEntity.ok("Hello public user, This api is accessible by all the users");
	}

	@GetMapping("/user/hello")
	public ResponseEntity<String> helloMember() {
		return ResponseEntity.ok("Hello dear user,This api is accessible by normal user and admin user as well");
	}

	@GetMapping("/admin/hello")
	public ResponseEntity<String> helloAdmin() {
		return ResponseEntity.ok("Nice day, admin! This api is only accessible by admin user");
	}

}