package br.com.springgestao.pucsigo.repository;

import br.com.springgestao.pucsigo.model.Repositorio;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RepositorioCustomRepository {

    private final EntityManager em;

    public RepositorioCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Repositorio> find(Long id, Long idrepositorio, String titulo) {

        String query = "select P from Repositorio as P ";
        String condicao = "where";

        if(id != null) {
            query += condicao + " P.id = :id";
            condicao = " and ";
        }

        if(idrepositorio != null) {
            query += condicao + " P.idrepositorio = :idrepositorio";
            condicao = " and ";
        }

        if(titulo != null) {
            query += condicao + " P.titulo = :titulo";
        }

        var q = em.createQuery(query, Repositorio.class);

        if(id != null) {
            q.setParameter("id", id);
        }

        if(idrepositorio != null) {
            q.setParameter("idrepositorio", idrepositorio);
        }

        if(titulo != null) {
            q.setParameter("titulo", titulo);
        }

        return q.getResultList();
    }

}
