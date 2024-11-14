package com.listGame.dslist.models;
import java.util.Objects;


public class Game {
    
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataform;
    private String imgUrl;

    private String descricaoCurta;
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

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
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

    public Game(Long id, String titulo, Integer ano, String genero, String plataform, String imgUrl, String descricaoCurta, String longDescricacao) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataform = plataform;
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
