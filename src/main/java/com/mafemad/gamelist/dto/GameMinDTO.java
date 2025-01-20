package com.mafemad.gamelist.dto;


import com.mafemad.gamelist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game gameEntity) {
        id = gameEntity.getId();
        title = gameEntity.getTitle();
        year = gameEntity.getYear();
        imgUrl = gameEntity.getImgUrl();
        shortDescription = gameEntity.getShortDescription();
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }
}
