package com.example.KafkaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.KafkaService.KafkaProducer;

@RestController
@RequestMapping("rest/kafka/api")
public class FetchMessageFromClient 
{
	@Autowired
	KafkaProducer kafkaProducer;
	
	public String sendMessage(@RequestParam("message")String message)
	{
		kafkaProducer.sendMessageToTopic(message);
		
		return "Message Sent Successfully to Topic";
	}
	
	
}
