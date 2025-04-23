package co.edu.unicauca.DesignPatterns.composite;

/**
 * Interfaz que define el componente base para la estructura del patrón Composite.
 * Esta interfaz permite tratar de manera uniforme tanto a objetos individuales (hojas)
 * como a grupos de objetos (composites) dentro de una estructura jerárquica de proyecto.
 * <p>
 * El patrón Composite permite construir estructuras de objetos en forma de árbol para
 * representar jerarquías parte-todo y permite a los clientes tratar objetos individuales
 * y composiciones de manera uniforme.
 *
 */
public interface ProjectComponent {

    /**
     * Muestra los detalles del componente.
     * Este método es implementado tanto por las hojas como por los composites
     * para mostrar información específica sobre el componente del proyecto.
     */
    public void showDetails();
}