package com.mafemad.gamelist.service;

import com.mafemad.gamelist.dto.GameMinDTO;
import com.mafemad.gamelist.entities.Game;
import com.mafemad.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }
}
