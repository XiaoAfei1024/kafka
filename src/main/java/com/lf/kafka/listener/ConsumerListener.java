package com.lf.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Liao Feng
 * @Description //TODO
 * @Date 2020/3/23 12:38
 * @Version 1.0
 */
@Component
@Slf4j
public class ConsumerListener {


    //声明consumerID为demo，监听topicName为topic.quick.demo的Topic
    @KafkaListener(id = "testTopic", topics = "topic.quick.initial")
    public void listen(String msgData) {
        log.info("demo receive : "+msgData);
    }

}
