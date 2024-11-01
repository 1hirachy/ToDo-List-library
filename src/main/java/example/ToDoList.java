package example;

import java.util.*;

public class ToDoList {

    private List <Task> tasks;

    public ToDoList(){
        tasks = new ArrayList<>();
    }

    // adding a new task to the list
    public void addTask(String description){
        tasks.add(new Task(description));
    }

    // Remove task by index
    public void removeTask(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }else{
            System.out.println("Task is out of range");
        }
    }


    // Mark a task as completed by index
    public void markTaskAsComplete(int index){
        if (index >= 0 && index <= tasks.size()){
            tasks.get(index).setComplete(true);
        }else{
            System.out.println("Task index out of range");
        }
    }


    // List all the tasks with their status
    public void listTasks(){
        for (int i = 0; i < tasks.size(); i ++ ){
            Task task = tasks.get(i);
            String status = task.isComplete()? "Completed" : "Pending";
            System.out.println(i + ". " + task.getDescription() + " [" + status + "]");
        }
    }

    // Get the list of task
    public List<Task> getTask(){
        return tasks;
    }

    // Get total tasks;
    public int getTotalTask(){
        return tasks.size();
    }

}