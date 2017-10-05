/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Prada
 */

package estructurasdedatos.cap1.complejidad;

public class Ciclos {
    
   // Numeros pares  
    public static void numerospares(){
        
        for(int i=500;i<=1000;i+=2){
    
  System.out.println(i);
}
}


    
//cuenta regresiva ciclo

     public static void cuentaregresiva (){
        
        for(int i=100;i>0;i--){
    
  System.out.println(i);
}
}

    
  
// contador 
public static void contador ()  {
        
int contador = 0;

        for(int i=0;i<=10000;i++){
            
            if (i % 20==0){
                
                contador++;
            }
        }
     System.out.println(contador);
}

    private Ciclos() {
    }
}
