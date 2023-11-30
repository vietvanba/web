package com.htth.web.service;

import com.example.htth.entity.Player;
import com.example.htth.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public Integer getGoldBalances(String username) {
        try {
            return repository.findByName(username).orElseThrow(() -> new RuntimeException("Please insert a correct username")).getVang();
        } catch (Exception e) {
            throw new RuntimeException("Please insert a correct username");
        }
    }

    public Integer getRubyBalances(String username) {
        try {
            return repository.findByName(username).orElseThrow(() -> new RuntimeException("Please insert a correct username")).getNgoc();
        } catch (Exception e) {
            throw new RuntimeException("Please insert a correct username");
        }
    }

    public Player insertGolds(String username, Integer gold) {
        Player player = repository.findByName(username).orElseThrow(() -> new RuntimeException("Please insert a correct username"));
        if (player.getVang() <= 1000000000) {
            if (player.getVang() + gold <= 1000000000) {
                player.setVang(player.getVang() + gold);
                return repository.save(player);
            } else
                throw new RuntimeException("Maximum are 1000000000 golds. Available gold can be insert are " + (1000000000 - player.getVang()));
        } else throw new RuntimeException("Can not insert more golds");
    }
    public Player insertRubies(String username, Integer ruby) {
        Player player = repository.findByName(username).orElseThrow(() -> new RuntimeException("Please insert a correct username"));
        if (player.getNgoc() <= 1000000000) {
            if (player.getNgoc() + ruby <= 1000000000) {
                player.setNgoc(player.getNgoc() + ruby);
                return repository.save(player);
            } else
                throw new RuntimeException("Maximum are 1000000000 rubies. Available ruby can be insert are " + (1000000000 - player.getVang()));
        } else throw new RuntimeException("Can not insert more rubies");
    }
    public Player resetGoldsAndRubies(String username) {
        Player player = repository.findByName(username).orElseThrow(() -> new RuntimeException("Please insert a correct username"));
        player.setVang(0);
        player.setNgoc(0);
        return repository.save(player);
    }
}
