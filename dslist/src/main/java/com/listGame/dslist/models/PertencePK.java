package com.listGame.dslist.models;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencePK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    public PertencePK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public PertencePK(){
        
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PertencePK)) {
            return false;
        }
        PertencePK pertencePK = (PertencePK) o;
        return Objects.equals(game, pertencePK.game) && Objects.equals(list, pertencePK.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
