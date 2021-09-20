package cn.lacknb;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: gitsilence
 * @description:
 * @date: 2021/9/20 4:02 下午
 **/
@SpringBootApplication
public class ProducerApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplicationMain.class, args);
    }

}
