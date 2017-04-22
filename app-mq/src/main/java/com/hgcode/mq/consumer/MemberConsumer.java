package com.hgcode.mq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by wentao on 2017/4/22.
 */
@Component
public class MemberConsumer {

    @RabbitListener( queues = {"member"})
    public void memberHandle(Message message){
        System.out.println(message);
    }
}
