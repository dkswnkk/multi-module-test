package com.example.multimoduleapi;

import com.example.multimoduledatabase.User;
import com.example.multimoduledatabase.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private static final String EMAIL = "email@gmail.com";
    private static final String PASSWORD = "password";

    private final UserRepository userRepository;

    @PostMapping("/sign-up")
    public void signUp() {
        userRepository.save(new User(EMAIL, PASSWORD));
    }
}
