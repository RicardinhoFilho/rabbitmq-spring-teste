package  com.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.EstoqueDto;
import dto.PrecoDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value="preco")
public class PrecoController {
	@PutMapping
 private ResponseEntity alteraPreco(@RequestBody PrecoDto precoDto) {
	 return new ResponseEntity(HttpStatus.OK);
 }
}
