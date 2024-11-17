package com.listGame.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listGame.dslist.models.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
    
}
