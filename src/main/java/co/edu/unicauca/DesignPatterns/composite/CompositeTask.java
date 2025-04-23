package co.edu.unicauca.DesignPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz ProjectComponent que representa una tarea compuesta
 * en un proyecto. Esta clase actúa como "composite" en el patrón Composite.
 * <p>
 * Una tarea compuesta puede contener tanto tareas individuales como otras tareas
 * compuestas, permitiendo crear una estructura jerárquica anidada de componentes.
 *
 * @see ProjectComponent
 * @see Task
 */
public class CompositeTask implements ProjectComponent {
    /** El nombre de la tarea compuesta */
    private String name;

    /** Lista de componentes (tareas individuales o compuestas) que contiene esta tarea */
    private List<ProjectComponent> components = new ArrayList<>();

    /**
     * Constructor que inicializa una nueva tarea compuesta con un nombre específico.
     *
     * @param name Nombre de la tarea compuesta
     */
    public CompositeTask(String name) {
        this.name = name;
    }

    /**
     * Añade un componente (tarea individual o compuesta) a esta tarea compuesta.
     *
     * @param component El componente a añadir
     */
    public void add(ProjectComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente de esta tarea compuesta.
     *
     * @param component El componente a eliminar
     */
    public void remove(ProjectComponent component) {
        components.remove(component);
    }

    /**
     * Muestra los detalles de esta tarea compuesta y, recursivamente,
     * los detalles de todos sus componentes.
     * Implementación del método de la interfaz ProjectComponent.
     */
    @Override
    public void showDetails() {
        System.out.println("Composite Task: " + name);
        for (ProjectComponent component : components) {
            component.showDetails();
        }
    }
}