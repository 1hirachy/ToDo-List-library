# To-Do List Project

A simple Java-based To-Do List application that allows users to add, remove, mark tasks as complete, and list all tasks. This application demonstrates basic Java OOP principles and can be run in the terminal.

## Features

- Add a new task to the to-do list
- Remove a task by its index
- Mark a task as complete
- List all tasks with their completion status
- Command-line interface for easy interaction

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven (for building the project)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/to-do-list.git
   cd to-do-list
2. **Build the project using Maven**:
   ```bash
    mvn clean package
   ```
3. **Running the Application**:
- After building the project, you can run the application by executing the JAR file:

   ```bash
    java -jar target/To-DoList-1.0-SNAPSHOT.jar
   ``` 
4. **Use it as a Lib Using Maven**:
   - Add the following to your `pom.xml`:
   
      ```xml
      <dependency>
          <groupId>com.example</groupId>
          <artifactId>todo-list</artifactId>
          <version>1.0-SNAPSHOT</version>
      </dependency>
      ```
### Usage
Once the application starts, you will see a menu with options:
1.   Add Task - Enter a task description to add it to the list.
2.   Remove Task - Remove a task by entering its index.
3.   Mark Task as Complete - Mark a task as complete by entering its index.
4.   List All Tasks - View all tasks with their statuses (Pending/Completed).
5.   Exit - Close the application.


### Code Structure

* Main.java: Entry point for the application, handling the main menu.
* ToDoList.java: Class that manages tasks, including adding, removing, marking as complete, and listing.
* Task.java: Represents a single task with description and completion status.
* Tests
  * Unit tests for the project are written using JUnit. Run tests with Maven:

     ```bash
     mvn test
     ```

### Contributing

Contributions are welcome! Please fork the repository and create a pull request with your improvements.