package br.com.springgestao.pucsigo.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springgestao.pucsigo.model.Norma;
import br.com.springgestao.pucsigo.repository.NormaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Norma")
public class NormaController {
	
	@Autowired
	NormaRepository normaRepository;
	
	@ApiOperation(value="Retorna uma lista de Normas")
	@GetMapping("/norma")
	public List<Norma> listaProdutos(){
		return normaRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um norma unico")
	@GetMapping("/norma/{id}")
	public Norma listaProdutoUnico(@PathVariable(value="id") long id){
		return normaRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um norma")
	@PostMapping("/norma")
	public Norma salvaProduto(@RequestBody @Valid Norma norma) {
		return normaRepository.save(norma);
	}
	
	@ApiOperation(value="Deleta um norma")
	@DeleteMapping("/norma")
	public void deletaProduto(@RequestBody @Valid Norma norma) {
		normaRepository.delete(norma);
	}
	
	@ApiOperation(value="Atualiza um norma")
	@PutMapping("/norma")
	public Norma atualizaProduto(@RequestBody @Valid Norma norma) {
		return normaRepository.save(norma);
	}
	 

}
