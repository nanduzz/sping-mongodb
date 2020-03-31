package com.example.escolura.models;

import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Aluno {

    private ObjectId id;

    private String nome;

    private LocalDate dataNascimento;

    private List<Nota> notas;

    private Curso curso;

    private List<Habilidade> habilidades;

    @Deprecated
    public Aluno() {
        //for jpa
    }

    private Aluno(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.dataNascimento = builder.dataNascimento;
        this.notas = builder.notas;
        this.curso = builder.curso;
        this.habilidades = builder.habilidades;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ObjectId getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }


    public static final class Builder {
        private ObjectId id;
        private String nome;
        private LocalDate dataNascimento;
        private List<Nota> notas;
        private Curso curso;
        private List<Habilidade> habilidades;

        private Builder() {
        }

        public Aluno build() {
            if(Objects.isNull(this.id)){
                this.id = ObjectId.get();
            }

            return new Aluno(this);
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder notas(List<Nota> notas) {
            this.notas = notas;
            return this;
        }

        public Builder curso(Curso curso) {
            this.curso = curso;
            return this;
        }

        public Builder habilidades(List<Habilidade> habilidades) {
            this.habilidades = habilidades;
            return this;
        }
    }
}
