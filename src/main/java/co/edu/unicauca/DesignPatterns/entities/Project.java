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

    public Project(String name) {
        this.name = name;
        this.status = "Created";
    }

    public String getName() {
        return name;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {this.complexity = complexity;}

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

    public void setState(String state) {
        this.status = state;
    }

    public String getState() {
        return this.status;
    }

    public static class Memento {
        private final String name;
        private final int complexity;
        private final String status;

        public Memento(String name, int complexity, String status) {
            this.name = name;
            this.complexity = complexity;
            this.status = status;
        }

        public String getName() { return name; }
        public int getComplexity() { return complexity; }
        public String getStatus() { return status; }
    }

    public Memento saveToMemento() {
        return new Memento(name, complexity, status);
    }

    public void restoreFromMemento(Memento memento) {
        this.name = memento.getName();
        this.complexity = memento.getComplexity();
        this.status = memento.getStatus();
    }

    @Override
    public String toString() {
        return "Project{name='" + name + "', complexity=" + complexity + ", status='" + status + "'}";
    }
}
