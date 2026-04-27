/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author DELL
 */
public class Libro {
     String titulo;
    String autor;
    int numeroPaginas;
    int anioPublicacion;
    
    public Libro(String titulo, String autor, int numeroPaginas, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }
}
