package com.acts.mongodb.repo;


import com.acts.mongodb.model.Todo;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
