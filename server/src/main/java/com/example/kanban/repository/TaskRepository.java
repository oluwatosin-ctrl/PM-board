package main.java.com.example.kanban.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.kanban.model.Task;

public interface TaskRepository extends  JPARepository {
    <List> Task findAll();
    Task findBy(Long id);
    Task save(Task task);
    void deleteById(Long id);
}
