package com.devsuperior.dsgames.serices;

import com.devsuperior.dsgames.dto.GameDTO;
import com.devsuperior.dsgames.dto.GameMinDTO;
import com.devsuperior.dsgames.entities.Game;
import com.devsuperior.dsgames.projections.GameMinProjection;
import com.devsuperior.dsgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var listGame = gameRepository.findAll();
        List<GameMinDTO> gameMinDto = listGame.stream().map(GameMinDTO::new).toList();

        return gameMinDto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId){
        Game result = gameRepository.findById(gameId).get();
        GameDTO gameDTO = new GameDTO(result);

        return gameDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> gameMinProjection = gameRepository.searchByList(listId);

        return gameMinProjection.stream().map(GameMinDTO::new).toList();
    }
}
