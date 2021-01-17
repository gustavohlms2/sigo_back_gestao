package br.com.springgestao.pucsigo.controller;

import br.com.springgestao.pucsigo.controller.dto.NormaRq;
import br.com.springgestao.pucsigo.controller.dto.NormaRs;
import br.com.springgestao.pucsigo.model.Norma;
import br.com.springgestao.pucsigo.repository.NormaCustomRepository;
import br.com.springgestao.pucsigo.repository.NormaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/norma")
public class NormaController {

    private final NormaRepository normaRepository;
    private final NormaCustomRepository normaCustomRepository;

    public NormaController(NormaRepository normaRepository, NormaCustomRepository normaCustomRepository) {
        this.normaRepository = normaRepository;
        this.normaCustomRepository = normaCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<NormaRs> findAll() {
        var normas = normaRepository.findAll();
        return normas
                .stream()
                .map(NormaRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public NormaRs findById(@PathVariable("id") Long id) {
        var norma = normaRepository.getOne(id);
        return NormaRs.converter(norma);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveNorma(@RequestBody NormaRq norma) {
        var n = new Norma();
        n.setIdRepositorio(norma.getIdRepositorio());
        n.setUrl(norma.getUrl());
        n.setTitulo(norma.getTitulo());
        n.setDescricao(norma.getDescricao());
        n.setDataCriacao(norma.getDataCriacao());
        n.setDataAlteracao(norma.getDataAlteracao());
        n.setIndativo(norma.getIndativo());
        normaRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody NormaRq norma) throws Exception {
        var p = normaRepository.findById(id);

        if (p.isPresent()) {
            var normaSave = p.get();
            normaSave.setIdRepositorio(norma.getIdRepositorio());
            normaSave.setUrl(norma.getUrl());
            normaSave.setTitulo(norma.getTitulo());
            normaSave.setDescricao(norma.getDescricao());
            normaSave.setDataCriacao(norma.getDataCriacao());
            normaSave.setDataAlteracao(norma.getDataAlteracao());
            normaSave.setIndativo(norma.getIndativo());
            normaRepository.save(normaSave);
        } else {
            throw new Exception("Norma Não encontrada");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = normaRepository.findById(id);
        if (p.isPresent()) {
            normaRepository.deleteById(id);        
        } else {
            throw new Exception("Norma Não encontrada");
        }
    }

}
