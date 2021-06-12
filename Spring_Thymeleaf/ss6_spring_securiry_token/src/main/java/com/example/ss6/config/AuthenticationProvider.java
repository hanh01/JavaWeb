package com.example.ss6.config;

import com.example.ss6.entity.UserEntity;
import com.example.ss6.service.TokenService;
import com.example.ss6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class AuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String s, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {
        Object credential = usernamePasswordAuthenticationToken.getCredentials();
        if (credential == null) {
            throw new UsernameNotFoundException("Cannot find user with authentication token");
        }
        String token = String.valueOf(credential);
//        UserEntity userEntity = userService.findUserByToken(token);
        UserEntity userEntity = tokenService.findUserByToken(token);
        if (userEntity == null) {
            throw new UsernameNotFoundException("Token invalid");
        }
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        authorities.add(new SimpleGrantedAuthority("USER"));
        User user = new User(userEntity.getUsername(), userEntity.getPassword(), authorities);
        return user;
    }
}
