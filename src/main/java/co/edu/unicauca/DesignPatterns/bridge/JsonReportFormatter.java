package co.edu.unicauca.DesignPatterns.bridge;

public class JsonReportFormatter implements ReportFormatter {
    @Override
    public void format(String content) {
        System.out.println("{\"content\": \"" + content + "\"}");
    }
}