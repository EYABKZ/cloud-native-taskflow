package com.TaskFlow.user_service.controller;

import com.TaskFlow.user_service.dto.UserRequest;
import com.TaskFlow.user_service.dto.UserResponse;
import com.TaskFlow.user_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Test endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello from TaskFlow User Service!";
    }

    // Create user
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@Valid @RequestBody UserRequest request) {
        return userService.createUser(request);
    }
    // Get all users
@GetMapping
public List<UserResponse> getAllUsers() {
    return userService.getAllUsers();
}
}
