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
public class NodoArbolB {
    
    private int setInsertar;
    private int getDato;
    private int dato;
    private NodoArbolB hijoDer;
    private NodoArbolB hijoIzq;

    public NodoArbolB(int dato, NodoArbolB hijoDer, NodoArbolB hijoIzq) {

        this.hijoDer = hijoDer;
        this.hijoIzq = hijoIzq;
        this.dato = dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setHijoDer(NodoArbolB hijoDer) {
        this.hijoDer = hijoDer;
    }

    public void setHijoIzq(NodoArbolB hijoIzq) {
        this.hijoDer = hijoIzq;
    }

    public NodoArbolB getHijoDer() {
        return hijoDer;
    }

    public NodoArbolB getHijoIzq() {
        return hijoIzq;

    }
}

  
       


    
      