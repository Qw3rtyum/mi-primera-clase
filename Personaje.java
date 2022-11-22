
/**
 * Crea un personaje jugador.
 * 
 * @author Qw3rtyum 
 * @version 0.1
 */
public class Personaje {
    private String nombre;
    private boolean armadura;
    private int hp;

    /**
     * Constructor de Personaje.
     */
    public Personaje(String nombrePersonaje, boolean tieneArmadura) {
        nombre = nombrePersonaje;
        armadura = tieneArmadura;
        hp = 100;
    }

    /**
     * Devuelve el nombre del personaje.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve si el personaje tiene armadura.
     */
    public boolean getArmadura() {
        return armadura;
    }
    
    /**
     * Devuelve el numero de hp.
     */
    public int getHp() {
        return hp;
    }
    
    /**
     * Cambia el nombre del personaje.
     */
    public void setNombre(String newNombre) {
        nombre = newNombre;
    }
    
    /**
     * Reduce el numero de hp.
     */
    public void herirPersonaje(int herida) {
        hp = hp - herida;
    }
    
    /**
     * Alterna si el personaje tiene armadura.
     */
    public void cambiarArmadura() {
        if (armadura == false) {
            armadura = true;
        }
        else {
            armadura = false;
        }
    }
    
    /**
     * Imprime las estatisticas del personaje.
     */
    public void printStats() {
        String estadoArmadura;
        if (armadura == true) {
            estadoArmadura = "Sí";
        }
        else {
            estadoArmadura = "No";
        }
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiene armadura?: " + estadoArmadura);
        System.out.println("Hp: " + hp);
    }
    
    /**
     * Devuelve las estatisticas del jugador.
     */
    public String getStats() {
        String statsData;
        String estadoArmadura;
        if (armadura == true) {
            estadoArmadura = "Sí";
        }
        else {
            estadoArmadura = "No";
        }
        statsData = "Nom: " + nombre + " | Arm: " + estadoArmadura + " | Hp: " + hp;
        return statsData;
    }
}
