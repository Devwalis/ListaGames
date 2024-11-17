package com.listGame.dslist.models;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_pertence")
public class Pertence {
    @EmbeddedId
    private PertencePK id = new PertencePK();
    private Integer position;
    
    public PertencePK getId() {
        return id;
    }

    public void setId(PertencePK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Pertence(Game game, GameList list,Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public Pertence(){

    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pertence)) {
            return false;
        }
        Pertence pertence = (Pertence) o;
        return Objects.equals(id, pertence.id) && Objects.equals(position, pertence.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position);
    }
    
    
    
}
