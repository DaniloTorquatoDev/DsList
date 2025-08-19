CREATE TABLE tb_games (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    year_of_release INT NOT NULL,
    genre VARCHAR(100),
    plataforms VARCHAR(255),
    img_url VARCHAR(500),
    short_description VARCHAR(1000),
    long_description TEXT
);
