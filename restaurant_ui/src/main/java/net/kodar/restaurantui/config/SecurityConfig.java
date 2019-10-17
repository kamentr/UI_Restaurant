package net.kodar.restaurantui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public CustomAuthenticationSuccessHandler myAuthenticationSuccessHandler() {
		return new CustomAuthenticationSuccessHandler();
	}

	@Autowired
	private CustomAuthenticationProvider authenticationProvider;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(authenticationProvider);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.antMatchers("/login", "/logout", "/resources/**", "/static/**", "/css/**", "/plugins/**", "/error**")
				.permitAll()
				.antMatchers("/waiter").hasAuthority("USER")
				.antMatchers("/cook").hasAuthority("ADMIN")
				.antMatchers("/apiusertable").hasAuthority("USER")
				.anyRequest().authenticated()
				.and()
				.formLogin().loginPage("/login")
				.successHandler(myAuthenticationSuccessHandler())
				.successForwardUrl("/home").defaultSuccessUrl("/home")
				.failureForwardUrl("/error").failureUrl("/error");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**",
				"/resources/static/**", "/css/**", "/js/**", "/img/**", "/fonts/**", "/images/**", "/scss/**",
				"/vendor/**", "/favicon.ico", "/auth/**", "/favicon.png", "/v2/api-docs", "/configuration/ui",
				"/configuration/security", "/swagger-ui.html", "/webjars/**", "/swagger-resources/**",
				"/swagge‌​r-ui.html", "/actuator", "/actuator/**", "/error**");
	}

}
