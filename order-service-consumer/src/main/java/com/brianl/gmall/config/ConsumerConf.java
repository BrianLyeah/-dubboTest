//package com.brianl.gmall.config;
//
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Properties;
//
///**
// * <p>
// *
// * </p>
// *
// * @Author 李星霖
// * @Date 2021-04-01 10:18
// */
//@Configuration
//public class ConsumerConf {
//
//    @Bean
//    public KafkaConsumer consumer() {
//        Properties props = new Properties();
//        //此处配置的是kafka的端口
//        props.put("metadata.broker.list", "127.0.0.1:9091");
//        //配置value的序列化类
//        props.put("serializer.class", "kafka.serializer.StringEncoder");
//        //配置key的序列化类
//        props.put("key.serializer.class", "kafka.serializer.StringEncoder");
//        return new KafkaConsumer<>(props);
//    }
//}
