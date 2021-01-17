package br.com.springgestao.pucsigo.controller.dto;

import java.text.DateFormat;

import br.com.springgestao.pucsigo.model.Repositorio;

public class RepositorioRs {

    private Long id;
    private String nome;
    private String url;
    private String descricao;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

    public static RepositorioRs converter(Repositorio p) {
        var repositorio = new RepositorioRs();
        repositorio.setId(p.getId());
        repositorio.setNome(p.getNome());
        repositorio.setUrl(p.getUrl());
        repositorio.setDescricao(p.getDescricao());
        repositorio.setDataCriacao(p.getDataCriacao());
        repositorio.setDataAlteracao(p.getDataAlteracao());
        repositorio.setIndativo(p.getIndativo());
        return repositorio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
