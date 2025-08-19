package com.dslist.service;

import com.dslist.entity.Games;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.dslist.repository.GamesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamesService {
    private final GamesRepository gamesRepository;

    public List<Games> findAllGames() {
        return gamesRepository.findAll();
    }
}
