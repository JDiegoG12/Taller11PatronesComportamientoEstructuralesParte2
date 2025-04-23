package co.edu.unicauca.DesignPatterns.bridge;

public class SmsReport extends ProjectReport {
    public SmsReport(ReportFormatter formatter) {
        super(formatter);
    }

    @Override
    public void generate(String content) {
        formatter.format("SMS Report: " + content);
    }
}