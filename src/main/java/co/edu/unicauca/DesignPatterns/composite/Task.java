package co.edu.unicauca.DesignPatterns.composite;

/**
 * Implementación de la interfaz ProjectComponent que representa una tarea
 * individual en un proyecto. Esta clase es una "hoja" en el patrón Composite.
 * <p>
 * Las tareas son los componentes más básicos en la estructura jerárquica del
 * proyecto y no pueden contener otros componentes.
 *
 * @see ProjectComponent
 */
public class Task implements ProjectComponent {
    /** El nombre de la tarea */
    private String name;

    /**
     * Constructor que inicializa una nueva tarea con un nombre específico.
     *
     * @param name Nombre de la tarea
     */
    public Task(String name) {
        this.name = name;
    }

    /**
     * Muestra los detalles de la tarea actual.
     * Implementación del método de la interfaz ProjectComponent.
     */
    @Override
    public void showDetails() {
        System.out.println("Task: " + name);
    }
}