package com.BancoDeDados.escola.service;

import com.BancoDeDados.escola.domain.Aluno;
import com.BancoDeDados.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Método para salvar aluno
    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Método para listar alunos
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }
}