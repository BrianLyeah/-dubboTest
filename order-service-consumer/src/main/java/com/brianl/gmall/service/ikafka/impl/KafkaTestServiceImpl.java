package com.brianl.gmall.service.ikafka.impl;

import com.brianl.gmall.service.ikafka.KafkaTestService;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

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

//    @Autowired
//    private Consumer consumer;


    @Override
    public void test01() {

    }

}
