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
public class Mapa <CV,VL> {
    
   private CV clave; 
   private VL valor;
   private Mapa <CV,VL> next;
   
   public Mapa (CV clave,VL valor) {
       this.clave = clave;
       this.valor = valor;
   }
   
   public CV getClave (){
       return clave;
   }
    
   public void setClave(CV clave) {
       this.clave = clave;
   }
     public VL getValor(){
       return valor;
   }
    
   public void setValor(VL valor) {
       this.valor = valor;
   }
   
   public Mapa getNext(){
       return next;
   }
   
   public void setNext(Mapa next){
       this.next = next;
   }
}
