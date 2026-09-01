package com.algaworks.algatransito_api.api.controller;
import com.algaworks.algatransito_api.domain.model.Proprietario;
import com.algaworks.algatransito_api.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
public class ProprietarioController {
    private final ProprietarioRepository proprietarioRepository;;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        return proprietarioRepository.findAll();
    }
}
