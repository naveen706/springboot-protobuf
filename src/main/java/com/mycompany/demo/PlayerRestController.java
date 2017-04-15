package com.mycompany.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
class PlayerRestController {

    private final PlayerRepository playerRepository;

    /**
     * {@code curl -v http://localhost:8080/players/1}
     */
    @GetMapping("/players/{id}")
    PlayerProtos.Player player(@PathVariable Integer id) {
        return this.playerRepository.findById(id);
    }

    /**
     * {@code curl -v http://localhost:8080/players}
     */
    @GetMapping("/players")
    PlayerProtos.PlayerList findAll() {
        return this.playerRepository.findAll();
    }
}
