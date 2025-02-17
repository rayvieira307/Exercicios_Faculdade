package com.BancoDeDados.escola.controller;

import com.BancoDeDados.escola.service.AlunoService;
import com.BancoDeDados.escola.domain.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // Endpoint para listar todos os alunos
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    // Endpoint para adicionar um aluno
    @PostMapping
    public Aluno adicionarAluno(@RequestBody Aluno aluno) {
        return alunoService.salvarAluno(aluno);
    }
}