package com.listGame.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.listGame.dslist.models.Game;

public class GameDTO {
    
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double score;
    private String imgUrl;
    private String descricaoCurta;
    private String longaDescricacao;

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Integer getAno() {
        return ano;
    }


    public void setAno(Integer ano) {
        this.ano = ano;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getPlataforma() {
        return plataforma;
    }


    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    public Double getScore() {
        return score;
    }


    public void setScore(Double score) {
        this.score = score;
    }


    public String getImgUrl() {
        return imgUrl;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public String getDescricaoCurta() {
        return descricaoCurta;
    }


    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }


    public String getLongaDescricacao() {
        return longaDescricacao;
    }


    public void setLongaDescricacao(String longaDescricacao) {
        this.longaDescricacao = longaDescricacao;
    }


    public GameDTO(){

    }


    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
}
