public class Tablero {
    public final int AGUA = 0;    // AGUA será 0
    public final int TOCADO = 1;  // TOCADO será 1
    public final int HUNDIDO = 2; // HUNDIDO será 2

    private Casilla[][] casillero;

    public Tablero() {
        // ===== NAVES ===== Aquí determinamos el nombre, tipo y vida de cada nave.
        Nave por1 = new Nave("Destructor", "portaaviones", 5);
        Nave fra1 = new Nave("Bismarck", "fragata", 3);
        Nave fra2 = new Nave("Prince of Wales", "fragata", 3);
        Nave fra3 = new Nave("Graf Spee", "fragata", 3);

        Nave sub1 = new Nave("U-47", "submarino", 1);
        Nave sub2 = new Nave("U-96", "submarino", 1);
        Nave sub3 = new Nave("U-505", "submarino", 1);
        Nave sub4 = new Nave("U-534", "submarino", 1);

        // ===== TABLERO BASE (SOLO CASILLAS) ===== Aquí estamos creando el casillero 10 x 10
        this.casillero = new Casilla[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.casillero[i][j] = new Casilla();
            }
        }

        // portaaviones Localización de los portaaviones en el casillero.
        this.casillero[1][1].nave = por1;
        this.casillero[1][2].nave = por1;
        this.casillero[1][3].nave = por1;
        this.casillero[1][4].nave = por1;
        this.casillero[1][5].nave = por1;

        // fragatas Localización de las fragatas en el casillero.
        this.casillero[3][3].nave = fra1;
        this.casillero[4][3].nave = fra1;
        this.casillero[5][3].nave = fra1;

        this.casillero[7][1].nave = fra2;
        this.casillero[7][2].nave = fra2;
        this.casillero[7][3].nave = fra2;

        this.casillero[9][1].nave = fra3;
        this.casillero[9][2].nave = fra3;
        this.casillero[9][3].nave = fra3;

        // submarinos Localización de los submarinos en el casillero.
        this.casillero[4][6].nave = sub1;
        this.casillero[9][9].nave = sub2;
        this.casillero[7][6].nave = sub3;
        this.casillero[9][5].nave = sub4;
    }

    // ===== DISPARO =====
    public Integer comprobarImpacto(int x, int y) { // Aquí comprobamos verdaderamente donde cayó el ataque que lanzamos en la clase Juego.
        System.out.println("Impacto en (" + x + "," + y + ")");
        return this.casillero[x][y].disparar();
    }
}