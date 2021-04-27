/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenif
 */
public class NodoArbol {
    private NodoArbol hijoizq; 
    private NodoArbol hijodere; 
    private int dato;
    
         
    public NodoArbol( int dato){
    this.dato = dato; 
    hijoizq = null; 
    hijodere = null; 
    }

    /**
     * @return the hijoizq
     */
    public NodoArbol getHijoizq() {
        return hijoizq;
    }

    /**
     * @param hijoizq the hijoizq to set
     */
    public void setHijoizq(NodoArbol hijoizq) {
        this.hijoizq = hijoizq;
    }

    /**
     * @return the hijodere
     */
    public NodoArbol getHijodere() {
        return hijodere;
    }

    /**
     * @param hijodere the hijodere to set
     */
    public void setHijodere(NodoArbol hijodere) {
        this.hijodere = hijodere;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
}
