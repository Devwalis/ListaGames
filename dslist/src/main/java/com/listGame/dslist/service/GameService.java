package com.listGame.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.listGame.dslist.dto.GameMinDTO;
import com.listGame.dslist.models.Game;
import com.listGame.dslist.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    

    public List<GameMinDTO> findAll() {
    var result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
   

    }
    
}
