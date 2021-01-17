package br.com.springgestao.pucsigo.controller.dto;

import java.text.DateFormat;

import br.com.springgestao.pucsigo.model.Norma;

public class NormaRs {

    private Long id;
    private Long idrepositorio;
    private String url;
    private String titulo;
    private String descricao;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

    public static NormaRs converter(Norma p) {
        var norma = new NormaRs();
        norma.setId(p.getId());
        norma.setIdRepositorio(p.getIdRepositorio());
        norma.setUrl(p.getUrl());
        norma.setDescricao(p.getDescricao());
        norma.setTitulo(p.getTitulo());
        norma.setDataCriacao(p.getDataCriacao());
        norma.setDataAlteracao(p.getDataAlteracao());
        norma.setIndativo(p.getIndativo());
        return norma;
    }

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
