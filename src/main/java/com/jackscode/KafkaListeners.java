package com.jackscode;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListeners {

    @KafkaListener(topics = "jackscode", groupId = "groupId")
    void listener(String data) {
        // consume the message
        System.out.println("Listener received: " + data + " 🎉");
    }
}
