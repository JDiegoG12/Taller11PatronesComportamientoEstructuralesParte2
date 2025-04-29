package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class EthicalEvaluator extends ProjectEvaluatorHandler{

    @Override
    public boolean handle(Project project) {
        if(project.getComplexity() <= 10){
            project.approved();
            System.out.println("Approved by Ethical Evaluator");
            return true;
        }else{
            project.rejected();
            System.out.println("Project Rejected: Too Complex");
            return false;
        }

    }
}
