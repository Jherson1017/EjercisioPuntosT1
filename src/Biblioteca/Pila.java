/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author DELL
 */
public class Pila {
    Nodo cima; 
    public Pila(){
        cima = null;
    }
    public void apilar(Libro libro){
        
        Nodo nuevo = new Nodo(libro);       
        nuevo.siguiente = cima;      
        cima = nuevo;
    }
    
    public void desapilar(){
        if(cima == null){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Libro desapilado: " + cima.dato.titulo);          
            cima = cima.siguiente;
        }
    }
    
    public void Mostrar(){
        if(cima == null){
            System.out.println("La pila está vacía");
        }else{
            Nodo aux = cima;
            
            System.out.println("\nLibros registrados en la pila:");
            
            while(aux != null){
                System.out.println("--------------------------");
                System.out.println("Título: " + aux.dato.titulo);
                System.out.println("Autor: " + aux.dato.autor);
                System.out.println("Año de publicacion: "+ aux.dato.anioPublicacion);
                System.out.println("Número de páginas: "+ aux.dato.numeroPaginas);
                System.out.println("--------------------------");
                
                aux = aux.siguiente;
            }
        }
    }
}
