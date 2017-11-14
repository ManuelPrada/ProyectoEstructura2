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

    private NodoArbolB hijoDerecho;

    private NodoArbolB hijoIzquierdo;

    private NodoArbolB p;

    private int dato;

    public NodoArbolB(int dato) {

        this.dato = dato;

        this.hijoDerecho = null;

        this.hijoIzquierdo = null;

        this.p = null;

    }

    public void setDato(int dato) {

        this.dato = dato;

    }

    public void setHijoDerecho(NodoArbolB hijoDerecho) {

        this.hijoDerecho = hijoDerecho;

    }

    public void setHijoIzquierdo(NodoArbolB hijoIzquierdo) {

        this.hijoIzquierdo = hijoIzquierdo;

    }

    public NodoArbolB getHijoDerecho() {

        return hijoDerecho;

    }

    public NodoArbolB getHijoIzquierdo() {

        return hijoIzquierdo;

    }

    public int getDato() {

        return dato;

    }

    public void setP(NodoArbolB p) {

        this.p = p;

    }

    public NodoArbolB getP() {

        return p;

    }

}
