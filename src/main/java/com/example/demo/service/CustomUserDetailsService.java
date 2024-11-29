package com.example.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // Usuários de exemplo
    private final Map<String, String> users = new HashMap<>();

    public CustomUserDetailsService() {
        users.put("admin", "$2a$10$Y8Ul7cJ9GH/wm/Dm8yUK6urvQkdsNLfkszjBRD0EVqJ9yKSnzgI1e"); // senha: 12345
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!users.containsKey(username)) {
            throw new UsernameNotFoundException("Usuário não encontrado.");
        }
        return User.withUsername(username)
                .password(users.get(username))
                .roles("USER")
                .build();
    }
}
