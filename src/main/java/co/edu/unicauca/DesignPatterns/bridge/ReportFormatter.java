package co.edu.unicauca.DesignPatterns.bridge;

/**
 * Interfaz que define la operación de formateo para reportes.
 * <p>
 * Esta interfaz forma parte del patrón de diseño Bridge, que desacopla una abstracción
 * de su implementación para que ambas puedan variar independientemente. Actúa como la
 * parte de "implementación" en el patrón Bridge, permitiendo diferentes formatos de
 * reportes que pueden ser utilizados por diferentes tipos de abstracciones de reportes.
 *
 * @author [Tu nombre]
 * @version 1.0
 */
public interface ReportFormatter {

    /**
     * Formatea el contenido proporcionado según la implementación específica.
     *
     * @param content Contenido del reporte a formatear
     */
    void format(String content);
}