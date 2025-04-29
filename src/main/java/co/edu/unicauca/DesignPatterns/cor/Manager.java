package co.edu.unicauca.DesignPatterns.cor;

public class Manager {
    private ProjectEvaluatorHandler technicalEvaluator;

    public void createAuthorizationFlow() {
        // Creamos los evaluadores
        technicalEvaluator = new TechnicalEvaluator();
        ProjectEvaluatorHandler adminEvaluator = new AdministrativeEvaluator();
        ProjectEvaluatorHandler ethicalEvaluator = new EthicalEvaluator();

        // Se arma la cadena
        technicalEvaluator.setNext(adminEvaluator);
        adminEvaluator.setNext(ethicalEvaluator);
    }

    public ProjectEvaluatorHandler getTechnicalEvaluator() {
        return technicalEvaluator;
    }
}

