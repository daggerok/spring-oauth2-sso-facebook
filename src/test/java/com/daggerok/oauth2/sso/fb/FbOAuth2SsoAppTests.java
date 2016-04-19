package com.daggerok.oauth2.sso.fb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FbOAuth2SsoApp.class)
public class FbOAuth2SsoAppTests {

    @Test
    public void contextLoads() {}
}
