package cn.lacknb.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author: gitsilence
 * @description:
 * @date: 2021/9/20 4:35 下午
 **/
@Component
@RocketMQMessageListener(topic = "${test.topic}", consumerGroup = "consumer-group-test")
public class TestConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String body) {
        System.out.println("收到消息：" + body);
    }
}
