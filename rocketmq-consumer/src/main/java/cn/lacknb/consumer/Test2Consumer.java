package cn.lacknb.consumer;

import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: gitsilence
 * @description:
 * @date: 2021/9/20 4:35 下午
 **/
@Component
// 广播模式
@RocketMQMessageListener(topic = "${test.topic}", consumerGroup = "${test.group}", messageModel = MessageModel.BROADCASTING)
public class Test2Consumer implements RocketMQListener<String> {

    @Value("${test.group}")
    private String groupName;

    @Override
    public void onMessage(String body) {
        System.out.println("second node 收到消息：" + body + " ->> groupName: " + groupName);
    }
}
