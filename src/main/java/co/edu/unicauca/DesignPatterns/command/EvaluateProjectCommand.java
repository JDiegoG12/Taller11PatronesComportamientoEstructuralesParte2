package co.edu.unicauca.DesignPatterns.command;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class EvaluateProjectCommand implements Command {
    private Project project;

    public EvaluateProjectCommand(Project project) {
        this.project = project;
    }
    
    public void execute() {
        if (project.getComplexity() <= 5) {
            project.approved();
            System.out.println("Project approved: " + project.getName());
        } else {
            project.rejected();
            System.out.println("Project rejected (too complex): " + project.getName());
        }
    }
}

