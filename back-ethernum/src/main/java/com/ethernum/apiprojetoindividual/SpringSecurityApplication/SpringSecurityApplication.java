//package com.ethernum.apiprojetoindividual.SpringSecurityApplication;
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SpringSecurityApplication extends WebSecurityConfigurerAdapter{
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		auth.inMemoryAuthentication()
//		.withUser("caio")
//		.password(passwordEncoder.encode("123"))
//		.roles("ADMIN", "USER");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.csrf()
//		.disable()
//		.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.httpBasic();
//	}
//}
