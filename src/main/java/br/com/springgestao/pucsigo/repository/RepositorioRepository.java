package br.com.springgestao.pucsigo.repository;

import br.com.springgestao.pucsigo.model.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRepository extends JpaRepository<Repositorio, Long> {
    
}
