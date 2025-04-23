package co.edu.unicauca.DesignPatterns.entities;

public class Project {

    private String name;
    private int complexity;
    private String status;

    public Project(String name, int complexity) {
        this.name = name;
        this.complexity = complexity;
        this.status = "Created";
    }

    public String getName() {
        return name;
    }

    public int getComplexity() {
        return complexity;
    }

    public String getStatus() {
        return status;
    }

    public void assigned() {
        status = "Assigned";
    }

    public void approved() {
        status = "Approved";
    }

    public void rejected() {
        status = "Rejected";
    }

    @Override
    public String toString() {
        return "Project{name='" + name + "', complexity=" + complexity + ", status='" + status + "'}";
    }
}
