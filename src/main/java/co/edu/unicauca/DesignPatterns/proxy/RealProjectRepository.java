package co.edu.unicauca.DesignPatterns.proxy;

/**
 * Implementación concreta de la interfaz ProjectRepository que representa el objeto real
 * en el patrón de diseño Proxy.
 * <p>
 * Esta clase realiza la operación efectiva de guardar proyectos en el repositorio.
 * Está protegida por el ProjectRepositoryProxy que controla el acceso a sus funcionalidades.
 *
 * @see ProjectRepository
 * @see ProjectRepositoryProxy
 */
public class RealProjectRepository implements ProjectRepository {

    /**
     * Guarda un proyecto en el repositorio.
     * Esta es la implementación real que realiza la operación de guardado.
     *
     * @param projectName Nombre del proyecto a guardar
     */
    @Override
    public void saveProject(String projectName) {
        System.out.println("Saving project: " + projectName);
    }
}