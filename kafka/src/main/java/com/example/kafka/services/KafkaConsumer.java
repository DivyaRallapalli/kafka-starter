package com.example.kafka.services;

import com.example.kafka.Repository.UserRepository;
import com.example.kafka.entities.User;import com.example.kafka.schema.userInfo;import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class KafkaConsumer {
  @Autowired UserRepository userRepository;

  @KafkaListener(topics = {"topic2"}, groupId = "topic2-group",containerFactory = "kafkaListenerContainerFactory")
  public void listenToTopic2( ConsumerRecord<String,userInfo> record) {
System.out.println("asdfgh "+record);
      System.out.println("werty "+record.value().getEmail());

 User userEntity= new User();
    if (record.value().getName()!=null) {
        System.out.println("not null");
     userEntity.setName(record.value().getName().toString());
 }

        userEntity.setAge(record.value().getAge());
        userEntity.setMobile(record.value().getMobile().toString());
        userEntity.setGender(record.value().getGender().toString());
        if(record.value().getEmail()!=null){
            userEntity.setEmail(record.value().getEmail().toString());
        }
        userEntity.setNationality(record.value().getNationality().toString());

        userRepository.save(userEntity);
    }
}
