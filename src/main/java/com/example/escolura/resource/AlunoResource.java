package com.example.escolura.resource;

import com.example.escolura.models.Aluno;
import com.example.escolura.models.Nota;
import com.example.escolura.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/alunos")
public class AlunoResource {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoResource(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @GetMapping("/add-sample")
    public void addSample() {
        Aluno aluno = Aluno.builder()
                .nome("Fernando2")
                .notas(List.of(new Nota(10d), new Nota(20d)))
                .build();
        alunoRepository.save(aluno);
    }
}
