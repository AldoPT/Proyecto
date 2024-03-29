package pkg23;

public class Libro {

    //atributos
    private String Titulo;
    private String Autor;
    private int Numero;
    private int Numeroexistencia;
    private int Numeroprestados;

    /**
     * Parametro vacio
     */
    public Libro() {

    }

    /*
    * Parametro 
     */
    public Libro(String Titulo, String Autor, int Numero, int Numexistencia, int Numprestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numero = Numero;
        this.Numeroexistencia = Numexistencia;
        this.Numeroprestados = Numprestados;
    }

    /**
     * Creamos Set y Get
     *
     * @return
     */
    public String getTitulo() {

        return Titulo;

    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getNumeroexistencia() {
        return Numeroexistencia;
    }

    public void setNumeroexistencia(int Numeroexistencia) {
        this.Numeroexistencia = Numeroexistencia;
    }

    public int getNumeroprestados() {
        return Numeroprestados;
    }

    public void setNumeroprestados(int Numeroprestados) {
        this.Numeroprestados = Numeroprestados;
    }

    public boolean Prestamo() {
        if (this.Numeroexistencia > 0) {
            this.Numeroprestados++;
            this.Numeroexistencia--;
            return true;
        } else {
            return false;
        }
    }

    public boolean Devolucion() {

        if (this.Numeroprestados == 0) {

            return false;
        } else {
            this.Numeroprestados--;
            return true;
        }

    }

    // Creamos to string
    @Override
    public String toString() {
        return "Titulo =" + Titulo + ", Autor=" + Autor + ", Numero=" + Numero + ", Numeroexistencia=" + Numeroexistencia + ", Numeroprestados=" + Numeroprestados;
    }

}
