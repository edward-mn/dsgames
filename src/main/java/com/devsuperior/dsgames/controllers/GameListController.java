package com.devsuperior.dsgames.controllers;

import com.devsuperior.dsgames.dto.GameListDTO;
import com.devsuperior.dsgames.dto.GameMinDTO;
import com.devsuperior.dsgames.dto.ReplacementDTO;
import com.devsuperior.dsgames.entities.Game;
import com.devsuperior.dsgames.serices.GameListService;
import com.devsuperior.dsgames.serices.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}

