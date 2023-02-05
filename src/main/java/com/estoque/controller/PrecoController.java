package  com.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.constantes.RabbitmqConstantes;
import com.estoque.service.RabbitmqService;

import dto.EstoqueDto;
import dto.PrecoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value="preco")
public class PrecoController {
	
	@Autowired
	private RabbitmqService rabbitmqService;
	
	@PutMapping
 private ResponseEntity alteraPreco(@RequestBody PrecoDto precoDto) {
		System.out.println(precoDto.codigoproduto);
		this.rabbitmqService.enviaMenssagem(RabbitmqConstantes.FILA_PRECO, precoDto);
	 return new ResponseEntity(HttpStatus.OK);
 }
}
