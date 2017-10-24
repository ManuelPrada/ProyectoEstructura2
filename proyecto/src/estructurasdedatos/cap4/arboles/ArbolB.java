/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.NodoArbolB;

/**
 *
 * @author ManuelPrada
 */
public class ArbolB {

    private NodoArbolB raiz;

    public ArbolB() {
        this.raiz = null;

    }

    public void setInsetar(int dato, NodoArbolB raiz) {
        NodoArbolB nuevo = new NodoArbolB(dato, null, null);
        if (raiz == null) {
            raiz = nuevo;
            
        } else if (dato < raiz.getDato()) {
            setInsetar(dato, raiz.getHijoIzq());
            raiz.setHijoIzq(nuevo);
        } else if (dato <= raiz.getDato()) {
            setInsetar(dato, raiz.getHijoDer());
            raiz.setHijoDer(nuevo);
        }
    }


public void  preorden ( NodoArbolB raiz){
      
}
