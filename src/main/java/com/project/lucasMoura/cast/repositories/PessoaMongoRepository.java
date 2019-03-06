package com.project.lucasMoura.cast.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.lucasMoura.cast.model.Pessoa;

public interface PessoaMongoRepository extends MongoRepository<Pessoa, String> {

}
