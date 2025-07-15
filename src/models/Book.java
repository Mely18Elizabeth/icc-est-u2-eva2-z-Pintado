package models;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Book other) {
        int cmpTitulo = other.titulo.compareToIgnoreCase(this.titulo); 
        if (cmpTitulo != 0) return cmpTitulo;

        int cmpAnio = Integer.compare(this.anio, other.anio);
        return cmpAnio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return anio == book.anio &&
               titulo.equalsIgnoreCase(book.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase(), anio);
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ") - " + autor;
    }
}
