public class Juego {
    private Tablero tablero;

    public Juego() {
        this.tablero = new Tablero(); // Creamos un tablero
    }

    public void mostrarResultado(Integer resultado) {
        if (resultado != null && resultado == 0) { // Como pusimos en la clase Tablero, agua es 0, entonces si el resultado coincide con 0, muestra "Agua"
            System.out.println("Agua");
        } else if (resultado != null && resultado == 1) { // Si no es agua, como pusimos en la clase Tablero, tocado es 1, entonces si el resultado coincide con 1, muestra "Tocado"
            System.out.println("Tocado");
        } else if (resultado != null && resultado == 2) { // Si no es agua ni tocado, como pusimos en la clase Tablero, hundido es 2, entonces si el resultado coincide con 2, muestra "Hundido"
            System.out.println("Hundido");
        } else if (resultado == null) { // Si el resultado da null, muestra por pantalla "Ya disparaste aquí"
            System.out.println("Ya disparaste aquí");
        }
    }

    public void lanzarAtaque(int x, int y) { // Lanzaremos el ataque en las coordenadas x e y
        System.out.println("\nAtaque en (" + x + "," + y + ")"); // Se muestra qué coordenadas estamos atacando

        Integer resultado = this.tablero.comprobarImpacto(x, y); // Resultado de donde cae el ataque.

        this.mostrarResultado(resultado); // Se muestra el resultado del ataque al usuario.
    }

    public void jugarDemo() { // Aquí es donde determinamos las casillas donde queremos lanzar el ataque.
        lanzarAtaque(1, 1);
        lanzarAtaque(4, 3);
        lanzarAtaque(4, 3);
        lanzarAtaque(6, 6);
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.jugarDemo();
    }
}
