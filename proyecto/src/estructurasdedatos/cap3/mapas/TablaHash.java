/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

/**
 *
 * @author tusk
 */
public class TablaHash {
    

    private Mapa [] TablaHash;
    private Mapa tamaño;
    private int tam;
    

    

    public void crearVector(int t) {
        this.tam = t;
        this.TablaHash = new Mapa[tam];
    }}