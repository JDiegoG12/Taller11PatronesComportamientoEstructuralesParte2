package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public abstract class ProjectEvaluatorHandler {

    protected ProjectEvaluatorHandler next;

    public void setNext(ProjectEvaluatorHandler next) {
        this.next = next;
    }

    public abstract boolean handle(Project project);

    public ProjectEvaluatorHandler getNextHandler(){
        return next;
    }
}
