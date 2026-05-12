/**
 * Representa un barco en el juego.
 * Mantiene el control de la vida del barco y decide cuando está hundido.
 * * @author Martín Barreiro Vidal
 * @version 12.05.2026
 */
public class Nave {

    /** Estado cuando el barco recibe un golpe pero le queda vida. */
    public static final int TOCADO = 1;

    /** Estado cuando la vida llega a cero. */
    public static final int HUNDIDO = 2;

    /** Nombre de la nave. */
    private String nombre;

    /** Categoría del barco (fragata, portaaviones, etc). */
    private String tipo;

    /** Puntos de golpe que le quedan. */
    private int vida;

    /** Indica si el barco ha sido destruido. */
    private boolean hundido;

    /**
     * Crea un barco nuevo con sus estadísticas iniciales.
     * * @param nombre Identificador del barco.
     * @param tipo Clase de nave.
     * @param vida Cuántos toques aguanta antes de hundirse.
     */
    public Nave(String nombre, String tipo, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.hundido = false;
    }

    /**
     * Resta vida al barco y comprueba si ha sido destruido.
     * * @return HUNDIDO si se queda sin vida, TOCADO en caso contrario.
     */
    public int recibirDisparo() {
        if (this.hundido) {
            return HUNDIDO;
        }

        this.vida -= 1;

        if (this.vida <= 0) {
            this.vida = 0;
            this.hundido = true;
            System.out.println(this.nombre + " hundido");
            return HUNDIDO;
        } else {
            System.out.println(this.nombre + " tocado. Vida restante: " + this.vida);
            return TOCADO;
        }
    }
}