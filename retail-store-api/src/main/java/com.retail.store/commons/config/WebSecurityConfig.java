package com.retail.store.commons.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  private final RestAuthenticationEntryPoint authenticationEntryPoint;

  @Autowired
  public WebSecurityConfig(RestAuthenticationEntryPoint authenticationEntryPoint) {
    this.authenticationEntryPoint = authenticationEntryPoint;
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf().disable();
    return http.build();
  }

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder)
      throws Exception {
    auth.inMemoryAuthentication()
        .passwordEncoder(PasswordEncoderConfig.passwordEncoder())
        .withUser("user1")
        .password(PasswordEncoderConfig.passwordEncoder().encode("password"))
        .roles("ADMIN");
  }
}
