package com.listGame.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.listGame.dslist.dto.GameDTO;
import com.listGame.dslist.dto.GameMinDTO;
import com.listGame.dslist.models.Game;
import com.listGame.dslist.projections.GameMinProjection;
import com.listGame.dslist.repository.GameRepository;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }

    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
    var result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
   
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }


    
}
