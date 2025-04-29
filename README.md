# Java Procedural To-Do List

A straightforward, console-based To-Do List application built entirely in Java using procedural programming principles (No OOP). This project is designed as an educational exercise for mastering programming fundamentals such as arrays, loops, and control flow.

## 🚀 Features

- **Add Tasks**: Easily add new tasks to your list.
- **View Tasks**: Display all current tasks along with their completion status.
- **Mark as Completed**: Update tasks to reflect a finished `[X]` status.
- **Delete Tasks**: Remove tasks completely from the list using an array-shifting algorithm.
- **Interactive Menu**: A loop-driven console interface that runs until the user chooses to exit.

## 🧠 Concepts Demonstrated

This project intentionally avoids Object-Oriented Programming (OOP) to focus strictly on fundamental logic:
- **Parallel Arrays**: Uses `String[]` for task descriptions and `boolean[]` for tracking completion status.
- **Control Flow**: Extensive use of `switch/case` menus and `if/else` logic bounds checking.
- **Loops**: Utilizes `while` for the main application lifecycle and `for` loops for iterating and dynamically shifting arrays.
- **Input Handling**: Uses `Scanner` for reading strings and safely parsing integer inputs.

## 🛠️ How to Run

1. Ensure you have the Java Development Kit (JDK) installed on your machine.
2. Clone this repository:
   ```bash
   git clone https://github.com/tahanawab4848/Todo-List.git
   ```
3. Navigate into the project folder:
   ```bash
   cd Todo-List
   ```
4. Compile the Java file:
   ```bash
   javac ToDoListApp.java
   ```
5. Run the application:
   ```bash
   java ToDoListApp
   ```
