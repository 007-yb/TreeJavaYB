
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenif
 */
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Opcion=0; 
        int dato;
        ArbolesBinarios arboles = new ArbolesBinarios();
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "1- Agregar Nodo\n" 
                    + "2- InOreden\n" 
                    + "3- PreOrden\n" 
                    + "4- PostOrden\n" 
                    + "5- Buscar Nodo\n" 
                    + "6- Calcular Altura\n" 
                    + "7- Salir\n", JOptionPane.QUESTION_MESSAGE ));
        switch(Opcion){
            case 1: 
                dato= Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE NODOS " , 
                        "ingresar nodo", JOptionPane.QUESTION_MESSAGE)); 
                arboles.InsertarNodo(dato);
                break;
                
                case 2: 
                if(!arboles.Vacio()){
                System.out.print("InOrden");
                arboles.InOrden(arboles.raiz);}
                else{
                    JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO" , 
                           " fin " , JOptionPane.INFORMATION_MESSAGE);
                }
                break; 
                
                case 3: 
                if(!arboles.Vacio()){
                System.out.print("PreOrden");
                arboles.PreOrden(arboles.raiz);}
                else{
                    JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO" , "fin", JOptionPane.INFORMATION_MESSAGE);
                }
                break; 
                
                case 4: 
                if(!arboles.Vacio()){
                System.out.print("PostOrden");
                arboles.PostOrden(arboles.raiz);}
                else{
                    JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO" , "fin", JOptionPane.INFORMATION_MESSAGE);
                }
                break; 
                
                case 5:
                    dato= Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO QUE QUIERE BUSCAR " , 
                       JOptionPane.QUESTION_MESSAGE)); 
                if(arboles.Buscar(dato)== true){
                    JOptionPane.showMessageDialog(null, "EL NODO" + dato +  "FUE ENCONTRADO");
                }else{
                     JOptionPane.showMessageDialog(null, "EL NODO NO FUE ENCONTRADO");
                }
                break;
                
                case 6:
                     System.out.println("LA ALTURA DEL ARBOL ES: " + arboles.retornarAltura());
                    break;
                case 7: 
                JOptionPane.showConfirmDialog(null, "ACCION FINALIZADA" , "fin", JOptionPane.INFORMATION_MESSAGE);
                break; 
            default: 
                JOptionPane.showMessageDialog(null, "OPCION INCORRETA" , "fin", JOptionPane.INFORMATION_MESSAGE);
        }    
       }while(Opcion !=0);{
        System.out.print(" ");}
    
   }
}
