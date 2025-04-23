package co.edu.unicauca.DesignPatterns.proxy;

/**
 * Interfaz que define operaciones para guardar proyectos en un repositorio.
 * <p>
 * Esta interfaz forma parte del patrón de diseño Proxy, que proporciona un objeto sustituto
 * o marcador de posición para otro objeto para controlar el acceso a éste. Tanto el objeto
 * real como el proxy implementan esta interfaz, lo que permite que sean utilizados de manera
 * intercambiable.
 *
 */
public interface ProjectRepository {

    /**
     * Guarda un proyecto en el repositorio.
     *
     * @param projectName Nombre del proyecto a guardar
     */
    void saveProject(String projectName);
}