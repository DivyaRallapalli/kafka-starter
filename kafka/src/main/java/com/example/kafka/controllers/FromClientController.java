package com.example.kafka.controllers;

import com.example.kafka.Requests.UserRequest;
import com.example.kafka.entities.User;
import com.example.kafka.schema.petInfo;import com.example.kafka.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FromClientController {



    @Autowired KafkaProducer kafkaProducer;

  @PostMapping(value = "/user")
  public String sendMessage(
      @RequestBody UserRequest userRequest) {
      com.example.kafka.schema.userInfo user=com.example.kafka.schema.userInfo.newBuilder().build();
    user.setName(userRequest.getName());
    user.setAge(userRequest.getAge());
    user.setMobile(userRequest.getMobile());
    user.setEmail(userRequest.getEmail());
    user.setGender(userRequest.getGender());
    user.setNationality(userRequest.getNationality());
        kafkaProducer.sendMessageToTopic(user);
        return "Message sent Successfully ";
    }

}
