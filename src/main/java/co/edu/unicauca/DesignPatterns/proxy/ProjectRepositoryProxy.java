package co.edu.unicauca.DesignPatterns.proxy;

/**
 * Implementación de la interfaz ProjectRepository que actúa como proxy para controlar
 * el acceso al repositorio real de proyectos.
 * <p>
 * Esta clase implementa el patrón de diseño Proxy, proporcionando un control de acceso
 * basado en autenticación antes de permitir operaciones en el repositorio real.
 * El proxy protege al objeto real añadiendo una capa de seguridad antes de
 * delegar la operación.
 *
 * @see ProjectRepository
 * @see RealProjectRepository
 */
public class ProjectRepositoryProxy implements ProjectRepository {

    /** El repositorio real al que este proxy controla el acceso */
    private RealProjectRepository realRepo = new RealProjectRepository();

    /** Nombre de usuario para la autenticación */
    private String user;

    /** Contraseña para la autenticación */
    private String password;

    /**
     * Constructor que inicializa el proxy con credenciales de autenticación.
     *
     * @param user Nombre de usuario para la autenticación
     * @param password Contraseña para la autenticación
     */
    public ProjectRepositoryProxy(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * Guarda un proyecto en el repositorio real después de verificar la autenticación.
     * Si la autenticación falla, se deniega el acceso y se muestra un mensaje.
     *
     * @param projectName Nombre del proyecto a guardar
     */
    @Override
    public void saveProject(String projectName) {
        if (authenticate()) {
            realRepo.saveProject(projectName);
        } else {
            System.out.println("Unauthorized access");
        }
    }

    /**
     * Verifica las credenciales de usuario para la autenticación.
     *
     * @return true si las credenciales son válidas, false en caso contrario
     */
    private boolean authenticate() {
        return "admin".equals(user) && "1234".equals(password);
    }
}