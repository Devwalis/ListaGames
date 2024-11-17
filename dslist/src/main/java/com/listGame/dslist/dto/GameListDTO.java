package com.listGame.dslist.dto;

import java.util.Objects;

import com.listGame.dslist.models.GameList;

public class GameListDTO {

    private Long id;
    private String nome;

    public GameListDTO(GameList entity) {
        id = entity.getId(); 
        nome = entity.getNome();
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

    public GameListDTO(){

    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameListDTO)) {
            return false;
        }
        GameListDTO gameListDTO = (GameListDTO) o;
        return Objects.equals(id, gameListDTO.id) && Objects.equals(nome, gameListDTO.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
    
    
}
