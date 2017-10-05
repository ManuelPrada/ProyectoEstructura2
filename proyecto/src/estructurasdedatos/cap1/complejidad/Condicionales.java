/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;
/**
 *
 * @author Manuel prada
 */
public class Condicionales {
    
    
    // precio mayor 
    public static void preciomayor() {

    int  precio=300;
   
    if (precio>100){    
   
  System.out.println("El precio es mayor que 100");
}
}


  
public static void condicion() {
// else en una condicion
    int  precio=50;
   
    if (precio>100){    
   
  System.out.println("El precio es mayor que 100");
  } 
    else{    
   
  System.out.println("El precio es  menor que 100");

}
}


    
//digitando el numero entero y se encuenta el mayor y menor 
    
    
public static void mayoromenor() {
        Scanner b=new Scanner(System.in);

        int n, mayor=0, menor=10, digito;
        
        System.out.println("Ingrese el numero a evaluar: ");
        
        n=b.nextInt();

        while(n>0){
            
            digito=n%10;
            
            n=n/10;
            
            if(digito>=mayor){
                mayor=digito;
                
            }
            if(digito<menor){
                menor=digito;
            }
        }
        System.out.println("El digito mayor es: "+mayor);
        System.out.println("El digito menor es: "+menor);
    }


    // division 
 public static void division (){

          int x = 12;
          int y = 2;
          int z = 0;
          if( y !=0 ) {
              z = x / y;
              System.out.println("El resultado es : " + z);
          } 
else   {
               System.out.println("se divide por 0");
          }
   }

    private Condicionales() {
    }
}
