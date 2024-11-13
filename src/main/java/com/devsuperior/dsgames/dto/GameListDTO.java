package com.devsuperior.dsgames.dto;

import com.devsuperior.dsgames.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameList gameListEntity) {
        id = gameListEntity.getId();
        name = gameListEntity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
