package  com.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.EstoqueDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value="estoque")
public class EstoqueController {
	@PutMapping
 private ResponseEntity alteraEstoque(@RequestBody EstoqueDto estoqueDto) {
	 return new ResponseEntity(HttpStatus.OK);
 }
}
