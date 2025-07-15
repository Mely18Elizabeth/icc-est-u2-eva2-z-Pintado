package controllers;

import models.Book;

import java.util.*;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Map<Book, Book> resultado = new TreeMap<>();
        for (Book libro : libros) {
            resultado.putIfAbsent(libro, libro);
        }
        return resultado;
    }
}
