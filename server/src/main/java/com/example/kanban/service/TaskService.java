package main.java.com.example.kanban.service;

import main.java.com.example.kanban.model.Task;
import main.java.com.example.kanban.repository.TaskRepository;
import java.util.*;


@Service
public class TaskService {


    @AutoWired
    private TaskRepository taskRepository;


    public List<Task> getAllTasks(){
        return Collections.singletonList(taskRepository.findAll());
    }
    public Task getTaskById(Long id) {
        return taskRepository.findBy(id).orElse(null);
    }
    public Task createTask(Task task){
       return taskRepository.save(task);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
