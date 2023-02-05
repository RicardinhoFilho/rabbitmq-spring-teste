package com.estoque;

import org.springframework.boot.SpringApplication;
import connections.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabbitmq.client.ConnectionFactory;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
@SpringBootApplication
public class EstoqueApplication {

	public static void main(String[] args) {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost", 5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
		RabbitMQConnection conn = new RabbitMQConnection(new RabbitAdmin(connectionFactory));
		SpringApplication.run(EstoqueApplication.class, args);
	}

}
