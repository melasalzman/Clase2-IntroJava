package com.ml.TM;

enum EstadoLibro {
    PRESTADO,DISPONIBLE,NODISPONIBLE;
}

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private EstadoLibro estadoLibro;

    public Libro(){
        setTitulo("");
        setIsbn("");
        setAutor("");
        setEstadoLibro(EstadoLibro.NODISPONIBLE);
    }

    public Libro(String titulo, String isbn, String autor, EstadoLibro estadoLibro){
        setTitulo(titulo);
        setIsbn(isbn);
        setAutor(autor);
        setEstadoLibro(estadoLibro);
    }

    /* Si cambiamos el metodo a toString, lo que sucederá es que tratará de sobreescribir con el @override
     * un método que no existe y nos dará error. El método que se debe sobreescribir es el toString().
     */
    @Override
    public String toString(){
        return this.titulo + ", " + this.isbn + ", " + this.autor + ", " + this.estadoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public EstadoLibro getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(EstadoLibro estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public void prestamo(){
        setEstadoLibro(EstadoLibro.PRESTADO);
    }

    public void devolucion(){
        setEstadoLibro(EstadoLibro.DISPONIBLE);
    }

}
