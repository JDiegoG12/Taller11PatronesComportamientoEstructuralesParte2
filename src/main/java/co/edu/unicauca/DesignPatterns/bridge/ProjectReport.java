package co.edu.unicauca.DesignPatterns.bridge;

public abstract class ProjectReport {
    protected ReportFormatter formatter;

    public ProjectReport(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public abstract void generate(String content);
}
