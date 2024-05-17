package com.intership.bankapi.security.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface MyUserDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}