package br.com.springgestao.pucsigo.repository;

import br.com.springgestao.pucsigo.model.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioRepository extends JpaRepository<Repositorio, Long> {
    Repositorio findById(long id); 
}
