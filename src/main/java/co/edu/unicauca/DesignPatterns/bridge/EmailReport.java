package co.edu.unicauca.DesignPatterns.bridge;

public class EmailReport extends ProjectReport {
    public EmailReport(ReportFormatter formatter) {
        super(formatter);
    }

    @Override
    public void generate(String content) {
        formatter.format("Email Report: " + content);
    }
}