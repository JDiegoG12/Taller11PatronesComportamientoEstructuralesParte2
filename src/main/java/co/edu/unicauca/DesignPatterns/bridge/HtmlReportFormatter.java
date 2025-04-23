package co.edu.unicauca.DesignPatterns.bridge;

public class HtmlReportFormatter implements ReportFormatter {
    @Override
    public void format(String content) {
        System.out.println("<html><body><h1>" + content + "</h1></body></html>");
    }
}