package com.kafka.consumer.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {
    @Autowired
private KafkaTemplate<String, String> kafkaTemplate;

public void sendMessage(String msg, String topicName) {
    kafkaTemplate.send(topicName, msg);
}
}
