package com.example.escolura.repository;

import com.example.escolura.models.Aluno;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends MongoRepository<Aluno, ObjectId> {
}
