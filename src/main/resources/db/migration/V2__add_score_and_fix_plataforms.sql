ALTER TABLE tb_games
ADD COLUMN score DECIMAL(2,1) CHECK (score >= 1 AND score <= 5);
