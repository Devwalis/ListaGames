package com.listGame.dslist.models;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_games")
public class Game {
    

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private Integer ano;
    @Column(nullable = false )
    private String genero;
    @Column(nullable = false)
    private String plataforma;
    @Column(nullable = false)
    private Double score;
    @Column(nullable = false, name = "img_url")
    private String imgUrl;

    @Column(columnDefinition = "TEXT", name = "descricao_curta")
    private String descricaoCurta;

    @Column(columnDefinition = "TEXT", name = "descricao_longa")
    private String longDescricacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getLongDescricacao() {
        return longDescricacao;
    }

    public void setLongDescricacao(String longDescricacao) {
        this.longDescricacao = longDescricacao;
    }

    public Game(Long id, String titulo, Integer ano, String genero, String plataforma, Double score, String imgUrl, String descricaoCurta, String longDescricacao) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.score = score;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.longDescricacao = longDescricacao;
    }

    public Game(){
        
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    


}
