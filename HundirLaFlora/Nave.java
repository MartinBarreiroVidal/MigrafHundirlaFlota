public class Nave {
    public static final int TOCADO = 1; // TOCADO será 1
    public static final int HUNDIDO = 2; // HUNDIDO será 2

    private String nombre;
    private String tipo;
    private int vida;
    private boolean hundido;

    public Nave(String nombre, String tipo, int vida) { // Aquí inicializamos la nave dándole valores
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.hundido = false;
    }

    public int recibirDisparo() {
        if (this.hundido) {
            return HUNDIDO;
        }

        this.vida -= 1;

        if (this.vida <= 0) { // Si la vida es menor o igual que 0, la nave está hundida (this.hundido = true)
            this.vida = 0;
            this.hundido = true;
            System.out.println(this.nombre + " hundido"); // Saca por pantalla el nombre de la nave y que está hundida.
            return HUNDIDO; // Retorna HUNDIDO ya que el barco ha sido golpeado y no tiene vida (this.vida=0).
        } else {
            System.out.println(this.nombre + " tocado. Vida restante: " + this.vida); // Muestra el nombre de la nave, que está tocada y la vida que le falta.
            return TOCADO; // Retorna TOCADO ya que el barco ha sido golpeado pero sigue con vida.
        }
    }
}