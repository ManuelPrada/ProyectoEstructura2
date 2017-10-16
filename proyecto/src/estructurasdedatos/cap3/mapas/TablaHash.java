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
public class TablaHash {
    

    private Mapa [] TablaHash;
    private Mapa tamaño;
    private int tam;


    public void CrearVector(int t) {
        this.tam = t;
        this.TablaHash = new Mapa[tam];
    }
    public int funcionhash(int valor) {
    int vect[] = new int[10];
       int num= valor;
        int posición;

        for(int i=0; i<10; i++){
        int rest = num % 10;
            num /= 10;
            vect[i] = rest;
        }
        
        return 0;
    
    }
}
 