/**
 * Representa una de las celdas del tablero.
 * Sabe si tiene un barco encima y si ya ha recibido un disparo.
 * * @author Martín Barreiro Vidal
 * @version 12.05.2026
 */
public class Casilla {

    /** El barco que hay en esta casilla. Si es null, es agua. */
    public Nave nave;

    /** Controla si ya se ha atacado esta posición. */
    private boolean disparada;

    /**
     * Crea una casilla nueva, inicialmente vacía y sin disparos.
     */
    public Casilla() {
        this.nave = null;
        this.disparada = false;
    }

    /**
     * Gestiona el ataque sobre la casilla.
     * * @return null si ya se había disparado aquí; 0 si es agua;
     * el estado del barco (tocado/hundido) si hay uno.
     */
    public Integer disparar() {
        if (this.disparada) {
            return null;
        }

        this.disparada = true;

        if (this.nave == null) {
            return 0;
        }

        return this.nave.recibirDisparo();
    }
}