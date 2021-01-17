package br.com.springgestao.pucsigo.repository;

import br.com.springgestao.pucsigo.model.Norma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NormaRepository extends JpaRepository<Norma, Long> {
    
}
