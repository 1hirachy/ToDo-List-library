package example;

public class Task {

    private String description;
    private boolean isComplete;

    public Task(String description){
        this.description = description;
        this.isComplete = false;
    }


    // Getters and Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
