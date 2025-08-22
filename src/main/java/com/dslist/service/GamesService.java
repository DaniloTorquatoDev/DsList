package com.dslist.service;

import com.dslist.dto.GameMinDTO;
import com.dslist.entity.Games;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.dslist.repository.GamesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GamesService {
    private final GamesRepository gamesRepository;

    public List<GameMinDTO> findAllGames() {
        return gamesRepository.findAll()
                .stream()
                .map(GameMinDTO::new)
                .toList();
    }
    public Optional<GameMinDTO>findGamesForId(Long id){
     return gamesRepository.findById(id)
             .map(GameMinDTO::new);
    }
}
