package com.example.KafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer 
{
	@Autowired
	private KafkaTemplate<String,String> kafktemplate;
	
	public void sendMessageToTopic(String message)
	{
		kafktemplate.send("My-topic-Karan",message);
	}
}

