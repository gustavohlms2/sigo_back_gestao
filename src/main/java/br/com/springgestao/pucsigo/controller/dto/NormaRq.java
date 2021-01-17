package br.com.springgestao.pucsigo.controller.dto;
import java.text.DateFormat;

public class NormaRq {

    private Long idrepositorio;
    private String url;
    private String descricao;
    private String titulo;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

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
