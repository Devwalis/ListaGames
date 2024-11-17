package com.listGame.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listGame.dslist.models.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

    
}
