package com.weshine.security;

import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/24
 */
@Service("adminUserDetailsService")
public class AdminUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User record = new User();
        record.setUsername(username);
        User user =userService.selectOne(record);
        if  (user==null){
            throw new UsernameNotFoundException(username+" not exist!");
        }
        Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(user);
        org.springframework.security.core.userdetails.User userdetail = new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.getEnabled(),
                user.getAccountNonExpired(),
                user.getCredentialsNonExpired(),
                user.getAccountNonLocked(),
                grantedAuths	//用户的权限
        );
        return userdetail;
    }

    private Set<GrantedAuthority> obtionGrantedAuthorities(User user) {
        Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
        for (String role : user.getSetRoles()) {
            authSet.add(new SimpleGrantedAuthority("ROLE_" + role));
        }
        return authSet;
    }
}
