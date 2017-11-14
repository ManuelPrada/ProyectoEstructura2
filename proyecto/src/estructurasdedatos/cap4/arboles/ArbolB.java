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

    public void insertar(int dato) {

        NodoArbolB nuevo = new NodoArbolB(dato);

        if (raiz == null) {

            raiz = nuevo;

        } else {

            NodoArbolB aux = raiz;

            while (aux != null) {

                nuevo.setP(aux);

                if (nuevo.getDato() >= aux.getDato()) {

                    aux = aux.getHijoDerecho();

                } else {

                    aux = aux.getHijoIzquierdo();

                }

            }

            if (nuevo.getDato() < nuevo.getP().getDato()) {

                nuevo.getP().setHijoIzquierdo(nuevo);

            } else {

                nuevo.getP().setHijoDerecho(nuevo);

            }

        }

    }

    public void buscar(int dato, NodoArbolB raiz) {

        if (raiz == null) {

            System.out.print("el arbol no tiene elementos");

        } else if (dato == raiz.getDato()) {

            System.out.println(raiz.getDato());

        } else if (dato > raiz.getDato()) {

            buscar(dato, raiz.getHijoDerecho());

        } else if (dato < raiz.getDato()) {

            buscar(dato, raiz.getHijoIzquierdo());

        } else {

            System.out.println("el numero no esta en el arbol");

        }

    }

    public void orden(NodoArbolB raiz) {

        if (raiz != null) {

            orden(raiz.getHijoIzquierdo());

            System.out.println(raiz.getDato());

            orden(raiz.getHijoDerecho());

        }

    }

    public void preorden(NodoArbolB raiz) {

        if (raiz != null) {

            System.out.println(raiz.getDato());

            preorden(raiz.getHijoIzquierdo());

            preorden(raiz.getHijoDerecho());

        }

    }

    public void posorden(NodoArbolB raiz) {

        if (raiz != null) {

            posorden(raiz.getHijoIzquierdo());

            posorden(raiz.getHijoDerecho());

            System.out.println(raiz.getDato());

        }

    }

    public void setRaiz(NodoArbolB raiz) {

        this.raiz = raiz;

    }

    public NodoArbolB getRaiz(NodoArbolB raiz) {

        return raiz;

    }

}
