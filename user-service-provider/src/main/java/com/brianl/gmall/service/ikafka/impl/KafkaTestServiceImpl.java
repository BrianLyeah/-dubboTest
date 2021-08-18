package com.brianl.gmall.service.ikafka.impl;

import com.brianl.gmall.service.ikafka.KafkaTestService;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-04-01 9:59
 */
@Component
public class KafkaTestServiceImpl implements KafkaTestService {

    @Autowired
    private Producer<String, String> producer;


    @Override
    public void test01() {

        int messageNo = 1000;
        final int COUNT = 10000;

        while (messageNo < COUNT) {
            String key = String.valueOf(messageNo);
            String data = "hello kafka message " + key;
            producer.send(new ProducerRecord<>("TEST-TOPIC", key, data));
            System.out.println(data);
            messageNo++;
        }



    }
}
