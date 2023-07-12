package com.acts.mongodb.controller;

import com.acts.mongodb.model.Todo;
import com.acts.mongodb.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAll() {
        List<Todo> std = new ArrayList<>();
        todoRepository.findAll().forEach(std::add);
        return std;
    }

    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void delete(String id) {
        todoRepository.deleteById(id);
    }

}

