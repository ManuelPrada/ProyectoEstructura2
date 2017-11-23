/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoArbolAVL {

    private int valor;
    private NodoArbolAVL dato;
    private NodoArbolAVL hijoIzquierdo;
    private NodoArbolAVL hijoDerecho;
    private NodoArbolAVL factorequilibrio;
    private int alturaArbol = 1;

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the dato
     */
    public NodoArbolAVL getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(NodoArbolAVL dato) {
        this.dato = dato;
    }

    /**
     * @return the hijoIzquierdo
     */
    public NodoArbolAVL getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    /**
     * @param hijoIzquierdo the hijoIzquierdo to set
     */
    public void setHijoIzquierdo(NodoArbolAVL hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    /**
     * @return the hijoDerecho
     */
    public NodoArbolAVL getHijoDerecho() {
        return hijoDerecho;
    }

    /**
     * @param hijoDerecho the hijoDerecho to set
     */
    public void setHijoDerecho(NodoArbolAVL hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    /**
     * @return the factorequilibrio
     */
    public NodoArbolAVL getFactorequilibrio() {
        return factorequilibrio;
    }

    /**
     * @param factorequilibrio the factorequilibrio to set
     */
    public void setFactorequilibrio(NodoArbolAVL factorequilibrio) {
        this.factorequilibrio = factorequilibrio;
    }

    /**
     * @return the alturaArbol
     */
    public int getAlturaArbol() {
        return alturaArbol;
    }

    /**
     * @param alturaArbol the alturaArbol to set
     */
    public void setAlturaArbol(int alturaArbol) {
        this.alturaArbol = alturaArbol;
    }

    public void calcularaltura(NodoArbolAVL raiz, int contador) {

        if (raiz != null) {
            calcularaltura(raiz.hijoIzquierdo, contador + 1);

            calcularaltura(raiz.hijoDerecho, contador + 1);

            //raiz.alturaArbol= Math.max(, alturaderecha);//
            System.out.println(contador);
        }

    }

}
