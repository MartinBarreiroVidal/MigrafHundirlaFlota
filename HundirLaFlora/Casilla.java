public class Casilla {
    public Nave nave;          // La nave que ocupa esta casilla (null si es agua)
    private boolean disparada; // Si ya se disparó aquí o no

    public Casilla() { // Aquí inicializamos la casilla: sin nave y sin disparar
        this.nave = null;
        this.disparada = false;
    }

    public Integer disparar() { // Usamos Integer (con mayúscula) para poder devolver null
        if (this.disparada) { // Si ya se disparó aquí, devolvemos null
            return null;
        }

        this.disparada = true; // Marcamos la casilla como disparada

        if (this.nave == null) { // Si no hay nave, es agua
            return 0; // AGUA
        }

        return this.nave.recibirDisparo(); // Si hay nave, le pasamos el disparo
    }
}