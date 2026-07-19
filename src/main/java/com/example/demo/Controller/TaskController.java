package com.example.demo.Controller;

import com.example.demo.Model.Task;
import com.example.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks") // Base URL එක සකස් කිරීම
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // 1. GET Request: Database එකේ තියෙන ඔක්කොම tasks ටික ලබා ගැනීම
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // 2. POST Request: Postman එකෙන් එවන data database එකට save කිරීම
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}