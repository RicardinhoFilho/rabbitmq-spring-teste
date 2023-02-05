package com.estoque.service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RabbitmqService {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	public void enviaMenssagem(String nomeFile, Object menssagem) {
		
		this.rabbitTemplate.convertAndSend(nomeFile,menssagem);
		
	}
}
