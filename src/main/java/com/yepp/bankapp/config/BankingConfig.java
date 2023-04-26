package com.yepp.bankapp.config;

import com.yepp.bankapp.service.security.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebMvc
@EnableWebSecurity
public class BankingConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("PUT","GET","POST", "DELETE")
//                .allowedHeaders("header1", "header2", "header3")
//                .exposedHeaders("header1", "header2")
                .allowCredentials(false).maxAge(3600);
    }


    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder.encode("admin"))
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(admin);
    }

    @Bean
    UserDetailsService userDetailsService() {
        return new MyUserDetailsService();
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests().antMatchers("/register**")
//                .permitAll() .anyRequest().authenticated()
//                .and()
//                .formLogin() .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout() .invalidateHttpSession(true)
//                .clearAuthentication(true) .permitAll();
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest()
//                .requestMatchers("/**")
                .authenticated()
                .and()
                .httpBasic();
//                .clearAuthentication(true) .permitAll();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

//    @Bean
//    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests()
//                .requestMatchers("/resources/**", "/signup", "/about").permitAll()
//                .requestMatchers("/**").hasRole("ADMIN")
//                .requestMatchers("/db/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//                // ...
////                .formLogin();
//        return http.build();
//    }
}


//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests()
//                .requestMatchers("/authentication/**").permitAll()
//                .requestMatchers("/h2/**").permitAll()
//                .anyRequest().authenticated()
////                .antMatchers("/accountholders/username/**", "/accountholders/register" ).permitAll()
//
//                .and()
//                .httpBasic();
////                .clearAuthentication(true) .permitAll();
//        return http.build();
//    }