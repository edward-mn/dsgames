package com.devsuperior.dsgames.serices;

import com.devsuperior.dsgames.dto.GameMinDTO;
import com.devsuperior.dsgames.entities.Game;
import com.devsuperior.dsgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        var listGame = gameRepository.findAll();
        List<GameMinDTO> gameDto = listGame.stream().map(GameMinDTO::new).toList();

        return gameDto;
    }
}
