package com.generation.crud.services;

import com.generation.crud.model.Alunos;
import com.generation.crud.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AlunosService {

    @Autowired
    private AlunosRepository alunosRepository;

    public Alunos save(Alunos aluno) {
        return this.alunosRepository.save(aluno);
    }

    public List<Alunos> findAll() {
        return this.alunosRepository.findAll();
    }

    public Alunos findById(Long id) {
        Optional<Alunos> resultado = this.alunosRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("O Aluno não foi encontrado!");
        }
        return resultado.get();
    }

    public Alunos deleteById(Long id) {
        Alunos aluno = this.findById(id);
        this.alunosRepository.delete(aluno);
        return aluno;
    }

    public Alunos updateById(Long id, Alunos aluno) {
        this.findById(id);
        aluno.setId(id);
        aluno = this.alunosRepository.save(aluno);
        return aluno;
    }

}
