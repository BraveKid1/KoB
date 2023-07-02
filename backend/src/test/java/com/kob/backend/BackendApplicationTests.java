package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("pgy"));
//        System.out.println(passwordEncoder.encode("pgy"));
//        System.out.println(passwordEncoder.encode("pgy"));
        System.out.println(passwordEncoder.matches("pgy","$2a$10$fPkUZ33Ps2RmqD/Vkjui3uGaPwt4YiGNeUia0KGQWNIFbigRwMk.i"));
    }

}
