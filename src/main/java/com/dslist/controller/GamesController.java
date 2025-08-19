package com.dslist.controller;

import com.dslist.entity.Games;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dslist.service.GamesService;

import java.util.List;

@RestController
@RequestMapping("/dslist/games")
@RequiredArgsConstructor
public class GamesController {
    private final GamesService gamesService;

    @GetMapping
    public ResponseEntity<List<Games>> findByAllGames() {
        return ResponseEntity.ok(gamesService.findAllGames());
    }
}
