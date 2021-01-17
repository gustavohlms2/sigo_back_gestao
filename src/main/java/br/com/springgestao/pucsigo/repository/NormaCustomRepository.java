package br.com.springgestao.pucsigo.repository;

import br.com.springgestao.pucsigo.model.Norma;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class NormaCustomRepository {

    private final EntityManager em;

    public NormaCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Norma> find(Long id, Long idrepositorio, String titulo) {

        String query = "select P from Norma as P ";
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

        var q = em.createQuery(query, Norma.class);

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
