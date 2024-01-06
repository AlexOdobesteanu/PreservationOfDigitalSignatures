package com.serviceltp.web;

import com.serviceltp.web.controller.AuthenticationRequest;
import com.serviceltp.web.controller.AuthenticationResponse;
import com.serviceltp.web.controller.RegisterRequest;
import com.serviceltp.web.models.User;
import com.serviceltp.web.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        if(repository.findByUsername(request.getUsername()).isPresent())
        {
            return AuthenticationResponse.builder().token("User already exists !").build();
        }
        var user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        var user = repository.findByUsername(request.getUsername())
                .orElseThrow();

        if (passwordEncoder.matches(request.getPassword(),user.getPassword()))
        {
            var jwtToken = jwtService.generateToken(user);
            return AuthenticationResponse.builder()
                    .token(jwtToken)
                    .build();
        }
        else
        {
            throw new AuthenticationServiceException("Could not login");
        }
    }
}
