package com.daggerok.oauth2.sso.fb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@EnableOAuth2Sso
@SpringBootApplication
public class FbOAuth2SsoApp {

    @RequestMapping("/user")
    public Principal user(Principal principal) {

        log.info("appears principal {}", principal);
        return principal;
    }

    public static void main(String[] args) {
        SpringApplication.run(FbOAuth2SsoApp.class, args);
    }
}
