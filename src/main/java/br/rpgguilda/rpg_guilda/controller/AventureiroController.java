package br.rpgguilda.rpg_guilda.controller;

import br.rpgguilda.rpg_guilda.model.Aventureiro;
import br.rpgguilda.rpg_guilda.service.AventureiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aventureiros")
public class AventureiroController {

    @Autowired
    private AventureiroService service;

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody Aventureiro a) {
        Aventureiro novo = service.registrar(a);
        return ResponseEntity.status(201).body(novo);
    }
}
