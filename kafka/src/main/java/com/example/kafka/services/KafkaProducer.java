package com.example.kafka.services;

import com.example.kafka.schema.petInfo;
import com.example.kafka.schema.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  @Autowired private KafkaTemplate<String, userInfo> kafkaTemplate2;
  public void sendMessageToTopic(userInfo user) {
        kafkaTemplate2.send("topic2",user.getName().toString(),user);
    }
}
