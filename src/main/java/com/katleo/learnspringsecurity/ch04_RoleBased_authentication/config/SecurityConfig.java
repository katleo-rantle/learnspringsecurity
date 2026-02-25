package com.katleo.learnspringsecurity.ch04_RoleBased_authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) {
        http.authorizeHttpRequests((requests) -> ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).authenticated());
        http.sessionManagement(session  -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin = User.withUsername("admin").password("{noop}pass1").roles("ADMIN").build();
        UserDetails user1 = User.withUsername("user1").password("{noop}pass2").roles("USER").build();
        return new InMemoryUserDetailsManager(user1,  admin);
    }
}
