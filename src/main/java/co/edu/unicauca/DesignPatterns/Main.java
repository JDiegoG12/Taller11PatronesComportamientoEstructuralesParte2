package co.edu.unicauca.DesignPatterns;

import co.edu.unicauca.DesignPatterns.bridge.*;
import co.edu.unicauca.DesignPatterns.command.AssignProjectCommand;
import co.edu.unicauca.DesignPatterns.command.Command;
import co.edu.unicauca.DesignPatterns.command.CommandInvoker;
import co.edu.unicauca.DesignPatterns.command.EvaluateProjectCommand;
import co.edu.unicauca.DesignPatterns.composite.CompositeTask;
import co.edu.unicauca.DesignPatterns.composite.ProjectComponent;
import co.edu.unicauca.DesignPatterns.composite.Task;
import co.edu.unicauca.DesignPatterns.cor.Manager;
import co.edu.unicauca.DesignPatterns.entities.Project;
import co.edu.unicauca.DesignPatterns.memento.Caretaker;
import co.edu.unicauca.DesignPatterns.proxy.ProjectRepository;
import co.edu.unicauca.DesignPatterns.proxy.ProjectRepositoryProxy;

public class Main {
    public static void main(String[] args) {
        // ------------------ COMMAND ------------------
        System.out.println("\n--- Command Pattern ---");
        Project project = new Project("Inventory System");
        project.setComplexity(8);
        Command assignCommand = new AssignProjectCommand(project);
        Command evaluateCommand = new EvaluateProjectCommand(project);
        CommandInvoker invoker = new CommandInvoker();

        invoker.setCommand(assignCommand);
        invoker.run();

        invoker.setCommand(evaluateCommand);
        invoker.run();

        // ------------------ CHAIN OF RESPONSIBILITY ------------------
        System.out.println("\n--- Chain of Responsibility ---");
        Manager manager = new Manager();
        manager.createAuthorizationFlow();
        Project project2 = new Project("Academic System");
        project2.setComplexity(6);
        manager.getTechnicalEvaluator().handle(project2);

        // ------------------ COMPOSITE ------------------
        System.out.println("\n--- Composite Pattern ---");
        CompositeTask mainTask = new CompositeTask("Develop Project");
        mainTask.add(new Task("Requirement Analysis"));
        mainTask.add(new Task("Implementation"));
        mainTask.showDetails();

        //------------------ MEMENTO ------------------
        System.out.println("\n--- Memento Pattern ---");
        Project statefulProject = new Project("eCommerce App");
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(statefulProject.saveToMemento());

        statefulProject.setState("In Progress");
        System.out.println("Current state: " + statefulProject.getState());
        caretaker.addMemento(statefulProject.saveToMemento());

        statefulProject.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Restored state: " + statefulProject.getState());
        statefulProject.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Restored state: " + statefulProject.getState());

        // ------------------ BRIDGE ------------------
        System.out.println("\n--- Bridge Pattern ---");
        ProjectReport smsReport = new SmsReport(new HtmlReportFormatter());
        smsReport.generate("Project completed with success");

        ProjectReport emailReport = new EmailReport(new JsonReportFormatter());
        emailReport.generate("Project completed with success");

        // ------------------ PROXY ------------------
        System.out.println("\n--- Proxy Pattern ---");
        ProjectRepository repo =new ProjectRepositoryProxy("admin", "1234");
        repo.saveProject("Blockchain System");

    }
}
