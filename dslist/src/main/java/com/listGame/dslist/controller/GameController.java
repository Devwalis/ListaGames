package com.listGame.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listGame.dslist.dto.GameMinDTO;
import com.listGame.dslist.models.Game;
import com.listGame.dslist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {


    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameMinDTO> findALL(){
    List<GameMinDTO> result = gameService.findAll();
    return result;

    }

    
}
