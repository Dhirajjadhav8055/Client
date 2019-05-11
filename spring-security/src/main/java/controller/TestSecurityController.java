package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {

	@RequestMapping("/")
	public String hello() {
		return "Hello User";

	}
	@RequestMapping("/notprotrcted")
	public String helloAgain() {
		return "Hello From Not Protected Page";

	}
	@RequestMapping("/protectedByUserRole")
	public String helloUser() {
		return "Hello User Role";
	}
	@RequestMapping("/protectedByAdminRole")
	public String helloAdmin() {
		return "Hello Admin Role";

	}
	

}
