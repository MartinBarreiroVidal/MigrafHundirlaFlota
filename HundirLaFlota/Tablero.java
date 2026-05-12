/**
 * Gestiona el tablero de juego.
 * Contiene la cuadrícula de 10x10 y se encarga de colocar los barcos
 * y procesar los disparos.
 * * @author Martín Barreiro Vidal
 * @version 12.05.2026
 */
public class Tablero {

    /** Código para disparo fallido. */
    public final int AGUA = 0;

    /** Código para barco golpeado pero no hundido. */
    public final int TOCADO = 1;

    /** Código para barco que se queda sin vida. */
    public final int HUNDIDO = 2;

    /** Matriz de 10x10 que representa las casillas del juego. */
    private Casilla[][] casillero;

    /**
     * Crea el tablero, rellena las casillas y coloca la flota
     * (portaaviones, fragatas y submarinos) en posiciones fijas.
     */
    public Tablero() {
        // ===== NAVES =====
        Nave por1 = new Nave("Destructor",      "portaaviones", 5);
        Nave fra1 = new Nave("Bismarck",         "fragata",      3);
        Nave fra2 = new Nave("Prince of Wales",  "fragata",      3);
        Nave fra3 = new Nave("Graf Spee",        "fragata",      3);

        Nave sub1 = new Nave("U-47",  "submarino", 1);
        Nave sub2 = new Nave("U-96",  "submarino", 1);
        Nave sub3 = new Nave("U-505", "submarino", 1);
        Nave sub4 = new Nave("U-534", "submarino", 1);

        // ===== TABLERO BASE =====
        this.casillero = new Casilla[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.casillero[i][j] = new Casilla();
            }
        }

        // ===== COLOCACIÓN DE NAVES =====
        this.casillero[1][1].nave = por1;
        this.casillero[1][2].nave = por1;
        this.casillero[1][3].nave = por1;
        this.casillero[1][4].nave = por1;
        this.casillero[1][5].nave = por1;

        this.casillero[3][3].nave = fra1;
        this.casillero[4][3].nave = fra1;
        this.casillero[5][3].nave = fra1;

        this.casillero[7][1].nave = fra2;
        this.casillero[7][2].nave = fra2;
        this.casillero[7][3].nave = fra2;

        this.casillero[9][1].nave = fra3;
        this.casillero[9][2].nave = fra3;
        this.casillero[9][3].nave = fra3;

        this.casillero[4][6].nave = sub1;
        this.casillero[9][9].nave = sub2;
        this.casillero[7][6].nave = sub3;
        this.casillero[9][5].nave = sub4;
    }

    /**
     * Procesa un ataque en una casilla concreta.
     * * @param x Fila del tablero.
     * @param y Columna del tablero.
     * @return null si ya se disparó ahí; 0 si es agua; 1 si es tocado; 2 si es hundido.
     */
    public Integer comprobarImpacto(int x, int y) {
        System.out.println("Impacto en (" + x + "," + y + ")");
        return this.casillero[x][y].disparar();
    }
}