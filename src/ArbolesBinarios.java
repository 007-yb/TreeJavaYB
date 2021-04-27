/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenif
 */
public class ArbolesBinarios {
    NodoArbol raiz; 
    int Altura; 
    int cont;
    
    public ArbolesBinarios(){
    raiz = null; 
    }
    
    public boolean Vacio(){
    return (raiz==null); 
    }
    public void InsertarNodo(int dato){
     NodoArbol nodo = new NodoArbol(dato);
        if (Vacio()) {
            raiz = nodo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (dato< raiz.getDato()) {
                    auxiliar = auxiliar.getHijoizq();
                    if (auxiliar == null) {
                        padre.setHijoizq(nodo);
                        return;
                    }
                } else {
                    if (dato> raiz.getDato()) {
                    auxiliar = auxiliar.getHijodere();
                    if (auxiliar == null) {
                        padre.setHijodere(nodo);
                        return;
                    }
                } 
                else {
                       System.out.println("EL DATO YA EXISTE " + dato); 
                        return; }
            }
        }

    }
 }
    
    public void InOrden(NodoArbol raiz){
    if(raiz!=null){
    InOrden(raiz.getHijoizq());
    System.out.println(raiz.getDato() + "   ");
    InOrden(raiz.getHijodere());}
    }
    
    public void PreOrden(NodoArbol raiz){
    if(raiz!=null){
    System.out.println(raiz.getDato() + "   ");
    PreOrden(raiz.getHijoizq());
    PreOrden(raiz.getHijodere());}
    }
    
    public void PostOrden(NodoArbol raiz){
    if(raiz!=null){
    PostOrden(raiz.getHijoizq());
    PostOrden(raiz.getHijodere());
    System.out.println(raiz.getDato() + "   ");}
    
    }
    
    public boolean Buscar(int dato){
        NodoArbol auxiliar=raiz; 
    while(dato!= auxiliar.getDato()){
   if(dato< auxiliar.getDato()){
   auxiliar = auxiliar.getHijoizq();
    }
   else{
   auxiliar = auxiliar.getHijodere();}
   if(auxiliar== null){
    return false;}
    }
    return true;
    }
    
    private void cantidadNodosHoja(NodoArbol reco) {
        if (reco != null) {
            if (reco.getHijoizq() == null && reco.getHijodere()== null) {
                cont++;
            }
            cantidadNodosHoja(reco.getHijoizq());
            cantidadNodosHoja(reco.getHijodere());
        }
    }

    public int cantidadNodosHoja() {
        cont = 0;
        cantidadNodosHoja(raiz);
        return cont;
    }

    public int retornarAltura() {
        Altura = 0;
        retornarAltura(raiz, 1);
        return Altura;
    }

    private void retornarAltura(NodoArbol reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getHijoizq(), nivel + 1);
            if (nivel > Altura) {
                Altura = nivel;
            }
            retornarAltura(reco.getHijodere(), nivel + 1);
        }
    }
    
}
 

    