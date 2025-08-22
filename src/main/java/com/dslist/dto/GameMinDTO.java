package com.dslist.dto;

import com.dslist.entity.Games;
import lombok.Getter;

@Getter
public class GameMinDTO {

    private Long id;
    private String title;
    private String genre;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Games games) {
        id = games.getId();
        title = games.getTitle();
        genre = games.getGenre();
        imgUrl = games.getImgUrl();
        shortDescription = games.getShortDescription();
    }
}
