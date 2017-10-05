/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author Manuel Prada
 */
public class NodoSimple {
    
    private NodoSimple siguiente;
    private int dato;

    
    public NodoSimple  getSiguiente() {
        return siguiente;
    }

  
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

  
    public int getDato() {
        return dato;
    }

 
    public void setDato(int dato) {
        this.dato = dato;
    }

    public void crearnodo() {
        this.siguiente = null;
        this.dato = 0;

    }

}