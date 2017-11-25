package com.weshine.security.config;

import com.weshine.model.enums.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/25
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService adminUserDetailsService;

    /**
     * 配置user-detail服务
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(adminUserDetailsService);
    }

    /**
     * 配置如何通过拦截器保护请求
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin().loginPage("/login").defaultSuccessUrl("/index",true)
                .usernameParameter("username").passwordParameter("password")
            .and()
                .logout().logoutSuccessUrl("/login?logout")
            .and()
                .rememberMe().tokenValiditySeconds(2419200).key("ssm-spring-security")
            .and()
                .authorizeRequests()
                .antMatchers("/static/**","/index.jsp").permitAll()
                .antMatchers(HttpMethod.GET,"/login").permitAll()
                .antMatchers("/setting/**").hasRole(RoleEnum.ADMIN.getRole())
                .antMatchers("/**").hasAnyRole(RoleEnum.ADMIN.getRole(),RoleEnum.ADMIN_MANAGER.getRole(),RoleEnum.ADMIN_OPERATOR.getRole());
    }

    /**
     * 配置Spring Security的Filter链
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
