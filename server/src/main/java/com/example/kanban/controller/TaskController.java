package main.java.com.example.kanban.controller;

import main.java.com.example.kanban.model.Task;
import main.java.com.example.kanban.service.TaskService;

import java.lang.annotation.Inherited;
import java.net.Authenticator;
import java.util.List;

@RestController
public class TaskController {


    @AutoWired
    private TaskService taskService;


    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();

    }
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTaskById(@PathVariable Long id){
         taskService.deleteTask(id);
    }



}
