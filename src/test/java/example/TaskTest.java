package example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    void setDescription_shouldSetDescription_correctly() {
        Task task = new Task("Initial  Task");
        task.setDescription("Updated Task");
        assertEquals("Updated Task", task.getDescription());
    }

    @Test
    void setComplete_shouldSetCompleteStatus() {
        Task task = new Task("Sample Task");
        task.setComplete(true);
        assertTrue(task.isComplete());
    }

    @Test
    void incompleteTask_shouldSetIncompleteStatus(){
        Task task = new Task("Random Task");
        assertFalse(task.isComplete());
    }
}
