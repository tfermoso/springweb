package com.ceica.springweb;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // Lista de nombres de usuario válidos (puedes cargarlos desde una base de datos o una fuente de datos)
    private static final List<String> validUsernames = Arrays.asList("user", "pepito", "juan");

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
// Verificamos si el nombre de usuario proporcionado está en la lista de nombres de usuario válidos
        if (!validUsernames.contains(username)) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

// Simulamos un usuario estático para fines de demostración
        UserDetails userDetails = User.builder()
                .username(username)
                .password("{noop}1234")
                .roles("USER")
                .build();

// Devolvemos los detalles del usuario simulado
        return userDetails;
    }
}
