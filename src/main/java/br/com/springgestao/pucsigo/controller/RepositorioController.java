package br.com.springgestao.pucsigo.controller;

import br.com.springgestao.pucsigo.controller.dto.RepositorioRq;
import br.com.springgestao.pucsigo.controller.dto.RepositorioRs;
import br.com.springgestao.pucsigo.model.Repositorio;
import br.com.springgestao.pucsigo.repository.RepositorioCustomRepository;
import br.com.springgestao.pucsigo.repository.RepositorioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/repositorio")
public class RepositorioController {

    private final RepositorioRepository repositorioRepository;
    private final RepositorioCustomRepository repositorioCustomRepository;

    public RepositorioController(RepositorioRepository repositorioRepository, RepositorioCustomRepository repositorioCustomRepository) {
        this.repositorioRepository = repositorioRepository;
        this.repositorioCustomRepository = repositorioCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<RepositorioRs> findAll() {
        var repositorios = repositorioRepository.findAll();
        return repositorios
                .stream()
                .map(RepositorioRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public RepositorioRs findById(@PathVariable("id") Long id) {
        var repositorio = repositorioRepository.getOne(id);
        return RepositorioRs.converter(repositorio);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveRepositorio(@RequestBody RepositorioRq repositorio) {
        var n = new Repositorio();
        n.setNome(repositorio.getNome());
        n.setUrl(repositorio.getUrl());
        n.setDescricao(repositorio.getDescricao());
        n.setDataCriacao(repositorio.getDataCriacao());
        n.setDataAlteracao(repositorio.getDataAlteracao());
        n.setIndativo(repositorio.getIndativo());
        repositorioRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody RepositorioRq repositorio) throws Exception {
        var p = repositorioRepository.findById(id);

        if (p.isPresent()) {
            var repositorioSave = p.get();
            repositorioSave.setNome(repositorio.getNome());
            repositorioSave.setUrl(repositorio.getUrl());
            repositorioSave.setDescricao(repositorio.getDescricao());
            repositorioSave.setDataCriacao(repositorio.getDataCriacao());
            repositorioSave.setDataAlteracao(repositorio.getDataAlteracao());
            repositorioSave.setIndativo(repositorio.getIndativo());
            repositorioRepository.save(repositorioSave);
        } else {
            throw new Exception("Repositorio Não encontrada");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = repositorioRepository.findById(id);
        if (p.isPresent()) {
            repositorioRepository.deleteById(id);        
        } else {
            throw new Exception("Repositorio Não encontrada");
        }
    }

}
