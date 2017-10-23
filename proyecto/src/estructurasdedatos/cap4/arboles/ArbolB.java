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



    public boolean esVacia() {

        return raiz == null;

    }



    public void insertar(int nodo1) {

        if (esVacia()) {

            NodoArbolB nuevonodo = new NodoArbolB();

            nuevonodo.dato = nodo1;

            nuevonodo.hijoderecho = new ArbolB();

            nuevonodo.hijoizquierdo = new ArbolB();

            raiz = nuevonodo;

        } else {

            if (nodo1 > raiz.dato) {

                raiz.hijoderecho.insertar(nodo1);

            }

            if (nodo1 < raiz.dato) {

                raiz.hijoizquierdo.insertar(nodo1);

            }

        }

    }

    public void preorden() {

        if (!esVacia()) {

            System.out.print(raiz.dato + ",");

            raiz.hijoizquierdo.preorden();

            raiz.hijoderecho.preorden();

        }

    }



    public void inorder() {

        if (!esVacia()) {

            raiz.hijoizquierdo.inorder();

            System.out.print(raiz.dato + ",");

            raiz.hijoderecho.inorder();

        }

    }



    public void postorder() {

        if (!esVacia()) {

            raiz.hijoizquierdo.postorder();

            raiz.hijoderecho.postorder();

            System.out.print(raiz.dato + ",");

        }

    }



}