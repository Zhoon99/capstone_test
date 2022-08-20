package com.example.capstone_tests.controller.user;

import com.example.capstone_tests.domain.dto.AccountDto;
import com.example.capstone_tests.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping(value="/users")
	public String createUser() throws Exception {

		return "user/login/register";
	}

	@PostMapping(value="/users")
	public String createUser(AccountDto accountDto) throws Exception {

		userService.createUser(accountDto);
		return "redirect:/";
	}

	@GetMapping(value="/mypage")
	public String myPage() throws Exception {
		return "user/mypage";
	}
}
