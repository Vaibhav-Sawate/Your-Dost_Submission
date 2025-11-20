package com.example.todo.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Todo {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private boolean completed = false;
    
}
