package com.generation.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


    @Entity
    public class Alunos {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        @NotBlank(message = "O nome do Aluno deve ser preenchido!")
        private String nome;

        @Column(nullable = false)
        @NotNull(message = "A idade do Aluno deve ser preenchida!")
        private Integer idade;

        @Column(nullable = false)
        @NotNull(message = "A nota do Aluno deve ser preenchida!")
        private Float notaPrimeiro;

        @Column(nullable = false)
        @NotNull(message = "A nota Aluno deve ser preenchida!")
        private Float notaSegundo;

        @Column(nullable = false)
        @NotBlank(message = "O nome do Professor deve ser preenchido!")
        private String professor;

        @Column(nullable = false)
        @NotNull(message = "A sala do Aluno deve ser preenchida!")
        private Integer sala;

        public Alunos() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        public Float getNotaPrimeiro() {
            return notaPrimeiro;
        }

        public void setNotaPrimeiro(Float notaPrimeiro) {
            this.notaPrimeiro = notaPrimeiro;
        }

        public Float getNotaSegundo() {
            return notaSegundo;
        }

        public void setNotaSegundo(Float notaSegundo) {
            this.notaSegundo = notaSegundo;
        }

        public String getProfessor() {
            return professor;
        }

        public void setProfessor(String professor) {
            this.professor = professor;
        }

        public Integer getSala() {
            return sala;
        }

        public void setSala(Integer sala) {
            this.sala = sala;
        }
    }
