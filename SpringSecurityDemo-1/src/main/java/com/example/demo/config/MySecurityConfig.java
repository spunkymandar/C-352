package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.authorizeRequests()
			.antMatchers("/public/*").permitAll()
			.antMatchers("/info/status").hasRole("ADMIN")
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic();
		
	}

	//OAuth, JWT tokens, Cloak
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication().withUser("mandar").password("mandar123").roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("neko").password("neko123").roles("NORMAL");
		auth.inMemoryAuthentication().withUser("mandar").password(this.passwordEncoder().encode("mandar123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("neko").password(this.passwordEncoder().encode("neko123")).roles("NORMAL");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
		
	}
	
	

}
