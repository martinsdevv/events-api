package com.martins.eventapi.Eventos_API.controller;

import com.martins.eventapi.Eventos_API.repository.UserRepository;
import com.martins.eventapi.Eventos_API.user.AuthenticationDTO;
import com.martins.eventapi.Eventos_API.user.RegisterDTO;
import com.martins.eventapi.Eventos_API.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authManager.authenticate(usernamePassword);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterDTO data) {
        if(this.userRepository.findByLogin(data.login()) != null) {
            return ResponseEntity.badRequest().build();
        }
        else {
            String encryptPassword = new BCryptPasswordEncoder().encode(data.password());
            User newUser = new User(data.login(), encryptPassword, data.role());

            this.userRepository.save(newUser);

            return ResponseEntity.ok().build();
        }
    }
}
