CREATE TABLE tb_belonging (
    game_id BIGINT NOT NULL,
    list_id BIGINT NOT NULL,
    position INT NOT NULL,

    PRIMARY KEY (game_id, list_id),

    CONSTRAINT fk_belonging_game
        FOREIGN KEY (game_id) REFERENCES tb_games (id),
    CONSTRAINT fk_belonging_list
        FOREIGN KEY (list_id) REFERENCES tb_game_list (id)
);
