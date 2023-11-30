package com.htth.web.controller;

import com.htth.web.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user/")
public class PlayerController {
    @Autowired
    PlayerService service;

    @GetMapping("gold")
    public ResponseEntity<?> getGoldBalances(@RequestParam String username) {
        return ResponseEntity.ok(service.getGoldBalances(username));
    }

    @GetMapping("ruby")
    public ResponseEntity<?> getRubyBalances(@RequestParam String username) {
        return ResponseEntity.ok(service.getRubyBalances(username));
    }

    @PostMapping("gold")
    public ResponseEntity<?> insertGolds(@RequestParam String username, @RequestParam Integer gold){
        return ResponseEntity.ok(service.insertGolds(username,gold));
    }
    @PostMapping("ruby")
    public ResponseEntity<?> insertRubies(@RequestParam String username,@RequestParam Integer ruby){
        return ResponseEntity.ok(service.insertRubies(username,ruby));
    }
    @DeleteMapping("reset")
    public ResponseEntity<?> resetGoldsAndRubies(@RequestParam String username){
        return ResponseEntity.ok(service.resetGoldsAndRubies(username));
    }
}