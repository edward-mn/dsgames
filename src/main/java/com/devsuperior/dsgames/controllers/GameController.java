package com.devsuperior.dsgames.controllers;

import com.devsuperior.dsgames.dto.GameDTO;
import com.devsuperior.dsgames.dto.GameMinDTO;
import com.devsuperior.dsgames.entities.Game;
import com.devsuperior.dsgames.serices.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{gameId}")
    public GameDTO findById(@PathVariable Long gameId){
        return gameService.findById(gameId);
    }
}

