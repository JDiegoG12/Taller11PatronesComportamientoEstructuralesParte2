package co.edu.unicauca.DesignPatterns.composite;

public class Task implements ProjectComponent {
    private String name;
    public Task(String name) {
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("Task: " + name);
    }
}
