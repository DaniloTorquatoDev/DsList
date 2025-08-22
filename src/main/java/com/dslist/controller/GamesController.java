package com.dslist.controller;

import com.dslist.dto.GameMinDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dslist.service.GamesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dslist/games")
@RequiredArgsConstructor
public class GamesController {
    private final GamesService gamesService;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findByAllGames() {
        List<GameMinDTO> games = gamesService.findAllGames();
        return ResponseEntity.ok(games);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<GameMinDTO>> findGamesForId(@PathVariable Long id) {
       Optional <GameMinDTO> gameMinDTO = gamesService.findGamesForId(id);
       if (gameMinDTO.isPresent()) {
           return ResponseEntity.ok(gameMinDTO);
       }
       return ResponseEntity.notFound().build();
    }
}
