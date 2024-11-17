package com.listGame.dslist.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_game_list")
public class GameList {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


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


public GameList(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


public GameList(){
    
 }
 @Override
 public boolean equals(Object o) {
     if (o == this)
         return true;
     if (!(o instanceof GameList)) {
         return false;
     }
     GameList gameList = (GameList) o;
     return Objects.equals(id, gameList.id) && Objects.equals(nome, gameList.nome);
 }

 @Override
 public int hashCode() {
     return Objects.hash(id, nome);
 }

}
