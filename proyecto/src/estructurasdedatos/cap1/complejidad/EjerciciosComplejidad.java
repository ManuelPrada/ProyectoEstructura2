/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class EjerciciosComplejidad {
    

    public void  punto1() {
    
    // O(1)
    // altomar los primeros 10 numeros mediante una formula que seria siendo 
    // (n+1) * (n/2) sria siendo la complejidad O(1) para esta formula no 
    // tendremos en cuenta los cilos 
    
    System.out.println("suma de los 10 primeros numeros es = ");
    System.out.println ((10+1) * (10/2));  //O(1)  
            
            //entonces O(1) seria siendo el peor de los casos.
}
   
  public void   punto2 (){
        
     // tenemos en cuenta un cilo de for donde nos dan valor a operar 
      // en el cual utilizamos un ciclo for a operar 
      
       for(int i = 0; i <= 12; i++){ // o(n)
			System.out.print("12 * "+ i + " = " + 12 * i + "\n");//o(1)
		}
	}  // donde el peor de los casos es O(n)
  
      
  public void punto3 (){
      
      
      // utilizamos dos ciclos For anidados, por lo que la complejidad es O(n^2)
      int n = 100; // o(1)
      boolean continuar = true ; // o(1)
      if (continuar){ // o(1)
          
          int i ; // o(1)
          int j ; // o(1)
          
          for(i = 0; i <= n ; i++){ // o(n)
               for(j = 0; j <= n ; j++){ // o(n)
              
                   System.out.println("i=>"+ 1 + "j="+j); //o(1)
                   // tenemos en cuenta que el peor de los casos seria O(n^2)
          }
            
          
      }
  }    
  }
  
  
  public int punto4(){
      
  //Algoritmo de busqueda binaria es de complejidad O(Log n), primero pide
   //un valor a buscar, luego  este algoritmo busca la posicion de la mitad 
   //del arreglo, compara el valor a buscar con el valor de la posicion de la mitad
    //si es menor entonces descarta los numeros de la derecha y busca en los de la
    //izquierda del valor medio, estableciendo un nuevo valor alto restando uno de la
    //posicion del valor medio, si el valor a buscar es igual al del medio retorna ese
    //valor, si el valor a buscar es mayor descarta los valores de la izquierda
    //y busca en los de la derecha, establece un nuevo valor bajo en medio menos uno,
    //y asi repite el proceso hasta encontrar el valor 
    
    
    
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingrese un numero a buscar: ");
       
       int busqueda = entrada.nextInt();
       
       int arreglo[]={2,23,27,29,36,45,47,56,60,78,190,234,456,460,478,503};
       
       int bajo=0;
       int alto=arreglo.length-1;
       while(bajo<=alto){
           
           int medio=(bajo+alto)/2;//valor de la mitad del arreglo
           
           if(busqueda<arreglo[medio]){
               
               alto=medio-1;//nuevo valor alto, descarta los de la derecha
               }else if(busqueda==arreglo[medio]){
                  
                       return medio; //retorna el medio si este es el buscado
                     }   
               else{
                             bajo=medio+1;//nuevo valor bajo; descarta val izq
                }
       }
       return 1;//Si el numero no esta en el arreglo devuelve -1
}
      
      
  
  public void punto5 (int A[], int izq, int der) {

      
 
 //Se elige un elemento de la lista de elementos a ordenar, al que llamaremos pivote.
 //como pivote se escoge inicialmente el numero en la posicion cero.       
 //Se ubican los demás elementos de la lista a cada lado del pivote, 
 //de manera que a un lado queden todos los menores que él, y al otro los mayores. 
 //Los elementos iguales al pivote pueden ser colocados tanto a su derecha 
 //como a su izquierda, dependiendo de la implementación deseada. En este momento,
 //el pivote ocupa exactamente el lugar que le corresponderá en la lista ordenada.
 //La lista queda separada en dos sublistas, una formada por los elementos a la 
 //izquierda del pivote, y otra por los elementos a su derecha. Se repite el proceso
 //de forma recursiva para cada sublista mientras éstas contengan más de un 
 //elemento. Una vez terminado este proceso todos los elementos estarán ordenad
      
     
      
  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho

 
  
  //algoritmo de ordenamiento quicksort que es de complejidad O(nLogN)
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  }

    private void quicksort(int[] A, int izq, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
          
         










  
    
    
    