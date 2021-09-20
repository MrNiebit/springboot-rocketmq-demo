package cn.lacknb.controller;

import cn.lacknb.entity.TestMessage;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: gitsilence
 * @description:
 * @date: 2021/9/20 4:12 下午
 **/
@RestController
public class HelloController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot ...";
    }

    @RequestMapping("/send")
    public String send(String msg) {
        TestMessage testMessage = new TestMessage();
        testMessage.setMsgId(UUID.randomUUID().toString());
        testMessage.setContent(msg);
        // sned-test 为topic
        rocketMQTemplate.convertAndSend("send-test", testMessage);
        return "消息投递 => " + msg + " 成功...";
    }

    @RequestMapping("/tag")
    public String sendWithTag(String msg) {
        TestMessage testMessage = new TestMessage();
        testMessage.setMsgId(UUID.randomUUID().toString());
        testMessage.setContent(msg);
        // sned-test 为topic  add 为 tag name
        rocketMQTemplate.convertAndSend("send-test:add", testMessage);
        return "消息发送 => " + msg + "成功！！！";
    }

}
