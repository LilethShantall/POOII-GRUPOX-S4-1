package libros;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private String sinopsis;
    private String genero;
    private boolean leido;

    public Libro(String isbn, String titulo, String autor, String sinopsis, String genero, boolean leido) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.leido = leido;
    }

    // Getters y setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}
