package com.tr.hipokampus.ws.auth;

import com.tr.hipokampus.ws.entity.UserEntity;
import com.tr.hipokampus.ws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       UserEntity user = userRepository.findByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("Username not found!");
        }else {
       return new HKUserDetails(user);
    }
    }
}
