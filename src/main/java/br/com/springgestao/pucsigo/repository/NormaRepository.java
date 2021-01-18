package br.com.springgestao.pucsigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springgestao.pucsigo.model.Norma;

public interface NormaRepository extends JpaRepository<Norma, Long> {
    Norma findById(long id);
}
