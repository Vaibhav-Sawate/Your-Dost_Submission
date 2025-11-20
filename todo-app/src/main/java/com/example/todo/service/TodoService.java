package com.example.todo.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TodoService {

    private final Map<Long, Todo> todoStore = new HashMap<>();
    private long idCounter = 1;

    public List<Todo> getAll() {
        return new ArrayList<>(todoStore.values());
    }

    public Todo create(Todo todo) {
        todo.setId(idCounter++);
        todoStore.put(todo.getId(), todo);
        return todo;
    }

    public Todo update(Long id, Todo updatedTodo) {
        Todo existing = todoStore.get(id);
        if (existing == null) return null;

        existing.setTitle(updatedTodo.getTitle());
        existing.setCompleted(updatedTodo.isCompleted());
        return existing;
    }

    public boolean delete(Long id) {
        return todoStore.remove(id) != null;
    }
}
