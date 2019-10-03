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
    public Libro(String Titulo, String Autor, int Numero, int Numeroexistencia, int Numeroprestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numero = Numero;
        this.Numeroexistencia = Numeroexistencia;
        this.Numeroprestados = Numeroprestados;
    }

    /**
     * Creamos Set y Get
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

    
    public int Prestamo(){
        int M=0;
      
        return 0;
        
    }
}
