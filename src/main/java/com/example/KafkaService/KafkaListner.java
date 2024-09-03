package com.example.KafkaService;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner 
{
	private final ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	
	@KafkaListener(topics="My-topic-Karan",groupId = "karan-grp-id22")
	public void listenToKaransTopic(String messageRecieved)
	{
		// With using Executors
		
		executorService.submit(() -> processMessage(messageRecieved));
		
		
	}
	
	public void processMessage(String message)
	{
		// Asynchronusly 
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
			
		}
	}
}
