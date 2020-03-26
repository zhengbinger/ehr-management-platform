package com.sensetime.ehr.emp.common.config;

import com.alibaba.fastjson.JSONObject;
import com.sensetime.ehr.emp.common.web.RspResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/menu/**", "/static/**", " /css/**", "/js/**", "/swagger-ui.html", "/webjars/**", "/v2/api-docs", "/swagger-resources/**");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginProcessingUrl("/login")
                .successForwardUrl("/index")
                .failureHandler(new LoginFailHandler())
                //                .successHandler(new LoginSuccessHandler())
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
        http.exceptionHandling().authenticationEntryPoint(new LoginExpireOrNoLoginHandler());
        http.csrf().disable();
    }

    /**
     * 登录成功处理
     */
//    private class LoginSuccessHandler implements AuthenticationSuccessHandler {
//
//        @Override
//        public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//
//        }
//    }

    /**
     * 登录失败处理
     */
    private static class LoginFailHandler implements AuthenticationFailureHandler {

        @Override
        public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            RspResult<String> result = new RspResult<>();
            result.setError(exception.getLocalizedMessage());
            String resultString = JSONObject.toJSONString(result);
            response.getWriter().write(resultString);
        }
    }

    /**
     * 登录超时或未登录处理
     */
    private static class LoginExpireOrNoLoginHandler implements AuthenticationEntryPoint {

        @Override
        public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            RspResult<String> result = new RspResult<>();
            result.setError("请登录");
            String resultString = JSONObject.toJSONString(result);
            response.getWriter().write(resultString);
        }
    }


}
