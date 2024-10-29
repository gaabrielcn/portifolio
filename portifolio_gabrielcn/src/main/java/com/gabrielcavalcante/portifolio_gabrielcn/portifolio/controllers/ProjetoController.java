package com.exemplo.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.exemplo.portfolio.models.Projeto;
import com.exemplo.portfolio.repositories.ProjetoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;

    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    @PostMapping
    public Projeto adicionarProjeto(@RequestBody Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id) {
        projetoRepository.deleteById(id);
    }
}
