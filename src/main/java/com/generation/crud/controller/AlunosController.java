package com.generation.crud.controller;


import com.generation.crud.model.Alunos;
import com.generation.crud.services.AlunosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private AlunosService alunosService;

    @PostMapping
    public ResponseEntity<Alunos> save(@RequestBody Alunos aluno) {
        Alunos savedAluno = this.alunosService.save(aluno);
        return new ResponseEntity<>(savedAluno, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Alunos>> findAll() {
        List<Alunos> alunos = this.alunosService.findAll();
        return new ResponseEntity<>(alunos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alunos> findById(@PathVariable Long id) {
        try {
            Alunos aluno = this.alunosService.findById(id);
            return new ResponseEntity<>(aluno, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        try {
            this.alunosService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alunos> updateById(@PathVariable Long id, @RequestBody Alunos aluno) {
        try {
            Alunos updatedAluno = this.alunosService.updateById(id, aluno);
            return new ResponseEntity<>(updatedAluno, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}