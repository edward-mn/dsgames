package com.devsuperior.dsgames.serices;

import com.devsuperior.dsgames.dto.GameListDTO;
import com.devsuperior.dsgames.dto.GameMinDTO;
import com.devsuperior.dsgames.projections.GameMinProjection;
import com.devsuperior.dsgames.repositories.GameListRepository;
import com.devsuperior.dsgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var listGame = gameListRepository.findAll();
        List<GameListDTO> gameListDTO = listGame.stream().map(GameListDTO::new).toList();

        return gameListDTO;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        var obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
