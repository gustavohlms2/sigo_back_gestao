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

import br.com.springgestao.pucsigo.model.Repositorio;
import br.com.springgestao.pucsigo.repository.RepositorioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Repositorios")
public class RepositorioController {
	
	@Autowired
	RepositorioRepository repositorioRepository;
	
	@ApiOperation(value="Retorna uma lista de Repositorios")
	@GetMapping("/repositorio")
	public List<Repositorio> listaProdutos(){
		return repositorioRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um repositorio unico")
	@GetMapping("/repositorio/{id}")
	public Repositorio listaProdutoUnico(@PathVariable(value="id") long id){
		return repositorioRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um repositorio")
	@PostMapping("/repositorio")
	public Repositorio salvaProduto(@RequestBody @Valid Repositorio repositorio) {
		return repositorioRepository.save(repositorio);
	}
	
	@ApiOperation(value="Deleta um repositorio")
	@DeleteMapping("/repositorio")
	public void deletaProduto(@RequestBody @Valid Repositorio repositorio) {
		repositorioRepository.delete(repositorio);
	}
	
	@ApiOperation(value="Atualiza um repositorio")
	@PutMapping("/repositorio")
	public Repositorio atualizaProduto(@RequestBody @Valid Repositorio repositorio) {
		return repositorioRepository.save(repositorio);
	}
	 

}
