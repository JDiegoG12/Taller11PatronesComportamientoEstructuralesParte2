package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class TechnicalEvaluator extends ProjectEvaluatorHandler{

    @Override
    public boolean handle(Project project) {
        if(project.getComplexity() <= 5){
            project.approved();
            System.out.println("Approved by technical Evaluator");
            return true;
        }else if(next != null){
            return next.handle(project);
        }
        return false;
    }
}
