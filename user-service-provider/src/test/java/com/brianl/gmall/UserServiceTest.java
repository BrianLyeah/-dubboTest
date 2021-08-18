package com.brianl.gmall;

import com.brianl.gmall.service.ikafka.KafkaTestService;
import org.apache.tomcat.util.buf.ByteChunk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-04-01 10:30
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = UserServiceProviderApplication.class)
public class UserServiceTest {

    @Autowired
    private KafkaTestService kafkaTestService;

    @Test
    public void test01() throws IOException {
        kafkaTestService.test01();



    }

}
