package example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {

    private ToDoList toDoList;

    @BeforeEach
    void setUp(){
        toDoList = new ToDoList();
    }

    @Test
    void addTask_shouldAddTaskToList(){
        toDoList.addTask("Sample Task");
        assertEquals(1, toDoList.getTotalTask());
        assertEquals("Sample Task", toDoList.getTask().get(0).getDescription());
    }

    @Test
    void removeTask_shouldRemoveTaskFromList(){
        toDoList.addTask("Task to be removed");
        toDoList.removeTask(0);
        assertEquals(0, toDoList.getTotalTask());
    }

    @Test
    void markTestAsComplete_shouldMarkTaskAsComplete(){
        toDoList.addTask("Incomplete Task");
        toDoList.markTaskAsComplete(0);
        assertTrue(toDoList.getTask().get(0).isComplete());
    }



}
