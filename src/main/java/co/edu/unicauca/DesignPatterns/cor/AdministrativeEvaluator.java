package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class AdministrativeEvaluator extends ProjectEvaluatorHandler{

    @Override
    public boolean handle(Project project) {
        if(project.getComplexity() <= 7){
            project.approved();
            System.out.println("Approved by Administrative Evaluator");
            return true;
        }else if(next != null){
            return next.handle(project);
        }
        return false;
    }
}


