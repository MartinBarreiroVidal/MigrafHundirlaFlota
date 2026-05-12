/**
 * Clase principal para jugar a Hundir la Flota.
 * Se encarga de controlar el flujo, lanzar los ataques y mostrar qué pasa en cada turno.
 * * @author Martín Barreiro Vidal
 * @version 12.05.2026
 */
public class Juego {

    /** El tablero de la partida. */
    private Tablero tablero;

    /**
     * Inicializa el juego y crea un tablero nuevo con los barcos colocados.
     */
    public Juego() {
        this.tablero = new Tablero();
    }

    /**
     * Traduce el código numérico del impacto a un mensaje de texto para el usuario.
     * * @param resultado Código del disparo: 0 (Agua), 1 (Tocado), 2 (Hundido) o null (Repetido).
     */
    public void mostrarResultado(Integer resultado) {
        if (resultado != null && resultado == 0) {
            System.out.println("Agua");
        } else if (resultado != null && resultado == 1) {
            System.out.println("Tocado");
        } else if (resultado != null && resultado == 2) {
            System.out.println("Hundido");
        } else if (resultado == null) {
            System.out.println("Ya disparaste aquí");
        }
    }

    /**
     * Realiza un disparo en las coordenadas dadas y muestra si acertó o no.
     *
     * @param x Fila del ataque.
     * @param y Columna del ataque.
     */
    public void lanzarAtaque(int x, int y) {
        System.out.println("\nAtaque en (" + x + "," + y + ")");
        Integer resultado = this.tablero.comprobarImpacto(x, y);
        this.mostrarResultado(resultado);
    }

    /**
     * Ejecuta una partida de prueba con varios disparos predefinidos.
     */
    public void jugarDemo() {
        lanzarAtaque(1, 1);
        lanzarAtaque(4, 3);
        lanzarAtaque(4, 3);
        lanzarAtaque(6, 6);
    }

    /**
     * Arranca la aplicación.
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.jugarDemo();
    }
}