package com.listGame.dslist.dto;

import com.listGame.dslist.models.Game;
import com.listGame.dslist.projections.GameMinProjection;

public class GameMinDTO {
    
    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;


public Long getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }


    public Integer getAno() {
        return ano;
    }


    public String getImgUrl() {
        return imgUrl;
    }


    public String getDescricaoCurta() {
        return descricaoCurta;
    }


public GameMinDTO(Game entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        descricaoCurta = entity.getDescricaoCurta();
    }
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        titulo =  projection.getTitulo();
        ano = projection.getAno();
        imgUrl = projection.getImgUrl();
        descricaoCurta = projection.getDescricaoCurta();
    }


public GameMinDTO(){

}



}