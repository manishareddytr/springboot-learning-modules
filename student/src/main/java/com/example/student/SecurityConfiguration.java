package com.example.student;



import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("manisha")
		.password("1234")
		.roles("ADMIN")
		.and()
        .withUser("arvind")
        .password("4321")
        .roles("USER");

	}

	@Bean
	public PasswordEncoder encode() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers( "/students/alldept").hasAnyRole("USER","ADMIN")
        .antMatchers("/students/byfirstname").hasAnyRole("USER","ADMIN")
        .antMatchers("/students/all").permitAll()
        .antMatchers("/students/**").hasRole("ADMIN")
        .and()
        .formLogin()
        .and()
        .httpBasic();
	}	
}
