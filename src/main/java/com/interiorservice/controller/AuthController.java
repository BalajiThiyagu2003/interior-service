package com.interiorservice.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interiorservice.dto.AuthRequest;
import com.interiorservice.dto.AuthResponse;
import com.interiorservice.dto.RegisterRequest;
import com.interiorservice.model.User;
import com.interiorservice.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
    	
    	return authService.registerUser(request);
    	
    }


    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        String token = authService.loginUser(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(new AuthResponse(token));
    }
    
    @GetMapping("/me")
    public Map<String, Object> getUserDetails(@AuthenticationPrincipal User user) {
        return Map.of(
            "email", user.getEmail(),
            "isAdmin", user.getIsAdmin()	
        );
    }

}
