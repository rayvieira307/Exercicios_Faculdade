package com.BancoDeDados.escola.repository;

import com.BancoDeDados.escola.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}