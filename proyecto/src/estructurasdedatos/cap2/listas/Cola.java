/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;
import estructurasdedatos.utiles.nodos.NodoPersona;
/**
 *
 * @author Manuel Prada
 */
public class Cola {
    
    private NodoPersona primero; 
    private NodoPersona ultimo; 
    private NodoPersona actual; 
        
    
    public void crearCola() 
    { 
    this.primero = null; 
    this.ultimo = null; 
    } 
    
    
    public void hacerCola (String nombre, String cedula) 
    { 
        NodoPersona nuevo = new NodoPersona(); 
        nuevo.setNombre(nombre);
        nuevo.setCedula(cedula);
        if(( this.primero==null)&&( this.ultimo== null)) 
        { 
            this.primero = nuevo; 
            this.ultimo = nuevo; 
        } 
        else 
        { 
            ultimo.setSiguiente(nuevo); 
            ultimo = nuevo; 
        } 
    } 
    
    
    public void atender() 
    { 
        primero = primero.getSiguiente(); 
    } 
    
   
    public void listar() 
    { 
        actual = primero; 
        while( actual!=null) 
        { 
            System.out.println( actual.getNombre()+" "+actual.getCedula()); 
            actual = actual.getSiguiente(); 
        } 
    } 
 
    
} 