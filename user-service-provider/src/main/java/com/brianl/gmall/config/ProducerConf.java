package com.brianl.gmall.config;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-04-01 10:18
 */
@Configuration
public class ProducerConf {

    @Bean
    public KafkaProducer producer() {
        Properties props = new Properties();
        //此处配置的是kafka的端口
        props.put("metadata.broker.list", "127.0.0.1:9092");
        //配置value的序列化类
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        //配置key的序列化类
        props.put("key.serializer.class", "kafka.serializer.StringEncoder");
        return new KafkaProducer<>(props);
    }

    public static void main(String[] args) throws IOException {
        String in="F:\\BaiduNetdiskDownload\\NIO\\nio\\4. 尚硅谷_NIO_直接缓冲区与非直接缓冲区.avi";
        String out="F:\\BaiduNetdiskDownload\\NIO\\nio\\source\\1.avi";
        ByteBuffer buf = ByteBuffer.allocateDirect(1024);
        FileChannel inChannel = FileChannel.open(Paths.get(in), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get(out), StandardOpenOption.WRITE,StandardOpenOption.CREATE,StandardOpenOption.READ);

        while (inChannel.read(buf) != -1) {
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }
        outChannel.close();
        inChannel.close();
    }
}
