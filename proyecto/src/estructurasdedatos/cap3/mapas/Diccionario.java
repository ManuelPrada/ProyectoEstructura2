/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

/**
 *
 * @author ManuelPrada
 */
public class Diccionario <CV,VL> {

private Mapa <CV , VL> primero;    
    
    public boolean empty() {
        return primero.getClave() == null;
    }

    public void add(CV clave, VL valor) {
        Mapa<CV, VL> nuevo = new Mapa<>(clave,valor);
        if (empty()) {
            this.primero.setClave (clave);
            this.primero.setValor(valor);
        } else {
            Mapa<CV, VL> aux = this.primero;
            while (aux.getNext() != null) {
             if (aux.getClave() != clave) {
               aux = aux.getNext();
                    
                } else {
                    if (aux.getClave() == clave) {
                        aux.setValor(valor);
                    }
                }
            }
            aux.setNext(nuevo);
        }
    }

    public void getValorbyClave(CV clave) {
        if (primero.getClave() == clave) {
            System.out.println("Llave: " + primero.getClave() + "Valor --> " + primero.getValor());
        } else {
            Mapa<CV, VL> aux = primero;
            while (aux != null) {
                if (aux.getClave() == clave) {
         