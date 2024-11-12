package com.devsuperior.dsgames.dto;

import com.devsuperior.dsgames.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private String imgUrl;
    private String shortDescription;
    private Integer year;

    public GameMinDTO() {}

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        year = entity.getYear();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Integer getYear() {
        return year;
    }
}
