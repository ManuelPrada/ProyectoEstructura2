/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;
import estructurasdedatos.utiles.nodos.NodoArbolAVL;
/**
 *
 * @author tusk
 */
public class ArbolAVL {
      
    public NodoArbolAVL raiz;
 
     
    public ArbolAVL( int valor ) {
        this.raiz = new NodoArbolAVL (  );
    }
 
    public ArbolAVL( NodoArbolAVL raiz ) {
        this.raiz = raiz;
    }
 
 
    public NodoArbolAVL getRaiz() {
        return raiz;
    }
 
    public void setRaiz(NodoArbolAVL raiz) {
        this.raiz = raiz;
    }
             
  
    private void Insertar(NodoArbolAVL nodo, NodoArbolAVL raiz ) {
        
        if ( raiz == null ) {
            
            this.setRaiz(nodo);
        }
        else {           
            if ( nodo.getValor() <= raiz.getValor() ) {              
                if (raiz.getHijoDerecho() == null) {
                    raiz.setHijoIzquierdo(nodo);
                }
                else {
                    Insertar( nodo , raiz.getHijoIzquierdo() );
                }
            }
            else {              
                if (raiz.getHijoDerecho() == null) {
                    raiz.setHijoDerecho(nodo);
                }
                else {
                    Insertar( nodo, raiz.getHijoDerecho());
                }
            }
        }
        
                 raiz.calcularaltura(raiz,0);
                 
                 
        
                  
}
}
