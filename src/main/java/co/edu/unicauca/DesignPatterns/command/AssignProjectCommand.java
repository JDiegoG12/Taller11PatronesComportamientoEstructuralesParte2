package co.edu.unicauca.DesignPatterns.command;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class AssignProjectCommand implements Command {
    private Project project;
    public AssignProjectCommand(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.assigned();
        System.out.println("Project assigned: " + project.getName());
    }
}

