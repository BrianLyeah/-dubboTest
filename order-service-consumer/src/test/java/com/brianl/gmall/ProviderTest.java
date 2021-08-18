package com.brianl.gmall;

import com.brianl.gmall.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;
import com.brianl.gmall.service.impl.TestAA;

import java.util.Objects;

@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = OrderServiceConsumerApplication.class)
public class ProviderTest {

    @Autowired
    JavaMailSender mailSender;
    @Autowired
    OrderService orderService;

    @Autowired
    private TestAA valueTest;

    @Value("${spring.mail.username}")
    private String from;

    @Test
    public void test01() {
        boolean equals = Objects.equals(null,null);
        System.out.println(equals);
    }



}