package com.listGame.dslist.projections;

public interface GameMinProjection {
    Long getId();
    String getTitulo();
    Integer getAno();
    String  getImgUrl();
    String  getDescricaoCurta();
  Integer getPosition();
}