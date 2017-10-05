/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;
import estructurasdedatos.utiles.nodos.NodoSimple;
/**
 *
 * @author Manuel Prada
 */
public class Pila {
    
private NodoSimple dato;
private NodoSimple tope;
    
    
    
    public NodoSimple getDato() {
        return dato;
    }


    public void setDato(NodoSimple dato) {
        this.dato = dato;
    }

    
    public Pila(){
        dato = null;
       
    }

    public boolean vacia(){
        return (tope == null);
    }
    
    
    
       public void apilar(String nombre, String fecha, String responsable){
        NodoSimple nuevo =new NodoSimple();
       
        if(vacia()){
            tope=nuevo;
        }else{
        nuevo.setSiguiente(tope);
        tope = nuevo;

        }
        
    }
       
       public void desapilar() {
       
        if (vacia()) {
          
            System.out.println("No existen elementos en la pila");
        } else {
           
           
            tope = tope.getSiguiente();

        }
    }
   
       
        public void listar() {
       
        if (!(tope == null)) {
           
            NodoSimple aux = tope;
            
            System.out.println("LA PILA SE CONFORMA POR");
            while (aux != null) {


                aux = aux.getSiguiente();
            }
        }

    }
}