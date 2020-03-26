package com.lf.kafka.send;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lf.kafka.bean.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * @Author Liao Feng
 * @Description //TODO
 * @Date 2020/3/23 12:33
 * @Version 1.0
 */
@RestController
@Slf4j
public class KafkaController {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    @GetMapping("message/send")
    public boolean send() {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        log.info("+++++++++++++++++++++  message = {}", gson.toJson(message));
        kafkaTemplate.send("test009",gson.toJson(message));

        return true;
    }
}
