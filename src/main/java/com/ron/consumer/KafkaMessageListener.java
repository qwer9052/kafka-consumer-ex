package com.ron.consumer;

import com.ron.dto.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListener {

    @KafkaListener(topics = "javatechie-demo", groupId = "jt-group")
    public void consume1(Customer customer) {
        log.info("consumer1 consume the message {}", customer.toString());
    }

//    @KafkaListener(topics = "javatechie-demo2", groupId = "jt-group-new")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {}", message);
//    }
//
//    @KafkaListener(topics = "javatechie-demo2", groupId = "jt-group-new")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {}", message);
//    }
//
//    @KafkaListener(topics = "javatechie-demo2", groupId = "jt-group-new")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {}", message);
//    }

}
