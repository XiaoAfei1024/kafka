package com.lf.kafka.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author Liao Feng
 * @Description //TODO
 * @Date 2020/3/23 12:44
 * @Version 1.0
 */
@Getter
@Setter
public class Message {
    private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //时间戳
}
