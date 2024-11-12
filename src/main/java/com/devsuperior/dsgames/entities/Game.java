package com.devsuperior.dsgames.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String platfom;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
    @Column(name = "game_year")
    private Integer year;

    public Game() {}

    public Game(
            Long id,
            String title,
            String genre,
            String platfom,
            String imgUrl,
            String shortDescription,
            String longDescription,
            Integer year
    ) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.platfom = platfom;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatfom() {
        return platfom;
    }

    public void setPlatfom(String platfom) {
        this.platfom = platfom;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Game game = (Game) object;
        return Objects.equals(id, game.id)
                && Objects.equals(title, game.title)
                && Objects.equals(genre, game.genre)
                && Objects.equals(platfom, game.platfom)
                && Objects.equals(imgUrl, game.imgUrl)
                && Objects.equals(shortDescription, game.shortDescription)
                && Objects.equals(longDescription, game.longDescription)
                && Objects.equals(year, game.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, platfom, imgUrl, shortDescription, longDescription, year);
    }
}
