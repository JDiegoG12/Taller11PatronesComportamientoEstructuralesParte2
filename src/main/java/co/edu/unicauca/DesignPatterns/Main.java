package co.edu.unicauca.DesignPatterns;

import co.edu.unicauca.DesignPatterns.bridge.*;
import co.edu.unicauca.DesignPatterns.composite.CompositeTask;
import co.edu.unicauca.DesignPatterns.composite.ProjectComponent;
import co.edu.unicauca.DesignPatterns.composite.Task;
import co.edu.unicauca.DesignPatterns.proxy.ProjectRepository;
import co.edu.unicauca.DesignPatterns.proxy.ProjectRepositoryProxy;

public class Main {
    public static void main(String[] args) {
        // ------------------ COMPOSITE ------------------
        System.out.println("\n--- Composite Pattern ---");
        CompositeTask mainTask = new CompositeTask("Develop Project");
        mainTask.add(new Task("Requirement Analysis"));
        mainTask.add(new Task("Implementation"));
        mainTask.showDetails();

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
