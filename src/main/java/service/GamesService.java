package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.GamesRepository;

@Service
@RequiredArgsConstructor
public class GamesService {
    private final GamesRepository gamesRepository;
}
