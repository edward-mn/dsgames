package com.devsuperior.dsgames.serices;

import com.devsuperior.dsgames.dto.GameListDTO;
import com.devsuperior.dsgames.dto.GameMinDTO;
import com.devsuperior.dsgames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var listGame = gameListRepository.findAll();
        List<GameListDTO> gameListDTO = listGame.stream().map(GameListDTO::new).toList();

        return gameListDTO;
    }
}
