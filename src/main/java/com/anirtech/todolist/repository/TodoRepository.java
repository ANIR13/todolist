package com.anirtech.todolist.repository;

import com.anirtech.todolist.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {
    List<Todo> findByCompleted(boolean completed);
    List<Todo> findByPriority(Todo.Priority priority);
}