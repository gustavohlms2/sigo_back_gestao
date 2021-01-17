package br.com.springgestao.pucsigo.model;


import java.text.DateFormat;
import javax.persistence.*;

@Entity
@Table(name = "norma")
public class Norma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="idrepositorio")
    private Long idrepositorio;

    @Column(name="url")
    private String url;

    @Column(name="titulo")
    private String titulo;

    @Column(name="descricao")
    private String descricao;

    @Column(name="data_criacao")
    private String data_criacao;

    @Column(name="data_alteracao")
    private String data_alteracao;

    @Column(name="indativo")
    private Boolean indativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRepositorio() {
        return idrepositorio;
    }

    public void setIdRepositorio(Long idrepositorio) {
        this.idrepositorio = idrepositorio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataCriacao() {
        return data_criacao;
    }

    public void setDataCriacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getDataAlteracao() {
        return data_alteracao;
    }

    public void setDataAlteracao(String data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public Boolean getIndativo() {
        return indativo;
    }

    public void setIndativo(Boolean indativo) {
        this.indativo = indativo;
    }
}
