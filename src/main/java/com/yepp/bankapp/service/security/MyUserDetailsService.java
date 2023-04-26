package com.yepp.bankapp.service.security;

import com.yepp.bankapp.Persistance.UserPersistence;
import com.yepp.bankapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserPersistence userPersistence;
    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final List<User> allByName = userPersistence.findAllByName(username);
        if (allByName.isEmpty()) {
            throw new UsernameNotFoundException(username);
        }
        User user = allByName.get(0);
        return new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return Collections.emptyList();
            }

            @Override
            public String getPassword() {
                return user.getPassword();
            }

            @Override
            public String getUsername() {
                return user.getName();
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };
    }
}
