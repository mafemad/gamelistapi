package com.mafemad.gamelist.controllers;

import com.mafemad.gamelist.dto.GameMinDTO;
import com.mafemad.gamelist.entities.Game;
import com.mafemad.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> getGames() {
        return gameService.findAll();
    }
}
