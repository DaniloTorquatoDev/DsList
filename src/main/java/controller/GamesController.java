package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.GamesService;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GamesController {
    private final GamesService gamesService;
}
