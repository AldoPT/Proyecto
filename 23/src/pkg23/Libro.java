package pkg23;

public class Libro {

    //atributos
    private String Titulo;
    private String Autor;
    private int Número;

    /**
     * costructor vacio
     */
    public Libro() {
    }

    /**
     * Constructor con parametros
     */

    public Libro(String Ti, String Au, int Num) {
        this.Titulo = Ti;
        this.Autor = Au;
        this.Número = Num;
    }

}
