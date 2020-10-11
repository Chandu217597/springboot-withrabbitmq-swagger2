package com.dlcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlcore.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/dlcore-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@GetMapping(value = "/producer")
	public String producer() {
	
		rabbitMQSender.send("");

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

}

