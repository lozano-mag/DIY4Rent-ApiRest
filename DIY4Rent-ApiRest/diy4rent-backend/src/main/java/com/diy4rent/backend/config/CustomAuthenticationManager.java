package com.diy4rent.backend.config;


import com.diy4rent.backend.SpringApplicationContext;
import com.diy4rent.backend.model.Usuario;
import com.diy4rent.backend.services.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

public class CustomAuthenticationManager implements AuthenticationManager {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String email = authentication.getName();
        String password = authentication.getCredentials().toString();

        UserService userService = (UserService) SpringApplicationContext.getBean("userService");
        PasswordEncoder encoder = (PasswordEncoder) SpringApplicationContext.getBean("passwordEncoder");
        Usuario user = userService.getUser(email);

        if (user != null) {


                  if (!encoder.matches(password, user.getPassword())) {
                    throw new BadCredentialsException("password incorrect");
                }
                else {
                    return new UsernamePasswordAuthenticationToken(email, password, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));

                }


        }

        else{
            throw new BadCredentialsException("user not found");
        }

    }

}
