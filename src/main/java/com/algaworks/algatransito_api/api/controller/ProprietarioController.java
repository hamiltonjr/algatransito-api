package com.algaworks.algatransito_api.api.controller;
import com.algaworks.algatransito_api.domain.model.Proprietario;
import com.algaworks.algatransito_api.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/proprietarios")
public class ProprietarioController {
    private final ProprietarioRepository proprietarioRepository;;

    @GetMapping
    public List<Proprietario> listar() {
        return proprietarioRepository.findAll();
    }

    @GetMapping("/{proprietarioId}")
    public ResponseEntity<Proprietario> buscar(@PathVariable Long proprietarioId) {
        return proprietarioRepository.findById(proprietarioId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Proprietario> adicionar(@RequestBody Proprietario proprietario) {
        Proprietario novo = proprietarioRepository.save(proprietario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }
}
