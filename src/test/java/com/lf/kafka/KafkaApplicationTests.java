package com.lf.kafka;

import org.apache.kafka.clients.admin.DescribeTopicsResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

@SpringBootTest
class KafkaApplicationTests {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void testDemo() throws InterruptedException {
        kafkaTemplate.send("testTopic", "this is my first demo");
        //休眠5秒，为了使监听器有足够的时间监听到topic的数据
        Thread.sleep(5000);
    }


    @Test
    public void testDefaultKafkaTemplate() {
        kafkaTemplate.sendDefault("I`m send msg to default topic");

    }


    @Test
    void contextLoads() {
    }

}
