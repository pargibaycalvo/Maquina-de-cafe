/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maqcafe;

import javax.swing.JOptionPane;

/**
 * menu de opciones para el usuario
 * @author ped90
 */
public class Maqcafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * objetos para llamar a las clases
         */
        maquina cliente = new maquina();
        display dinero = new display();
        monedero comp = new monedero();
        azucar select = new azucar();
        productos pro = new productos();
        
        /**
         * menu de opciones de la maquina de café
         */ 
        int opcion1, opcion2, opcion3;
        do{
        opcion1= Integer.parseInt(JOptionPane.showInputDialog("1) Introducir dinero. \n2) Selecciona el azucar. \n3) Elija el producto. \n4) Devolucion. \n0) Salir."));
        switch(opcion1){
            case 1:
                comp.introDinero();
                break;
            case 2:
                do{
                opcion2= Integer.parseInt(JOptionPane.showInputDialog("1) Aumentar azucar. \n2) Disminuir azucar. \n0) Salir al menú principal"));
                switch(opcion2){
                    case 1:
                        select.aumentarAzucar();
                        break;
                    case 2:
                        select.disminuirAzucar();
                        break;
                }
                }
                while(opcion2!=0);
                break;
            case 3:
                do{
                opcion3= Integer.parseInt(JOptionPane.showInputDialog("1) Té. \n2) Chocolate. \n3) Café. \n0) Salir al menú principal. "));
                switch(opcion3){
                    case 1:
                        pro.te();
                        break;
                    case 2:
                        pro.chocolate();
                        break;
                    case 3:
                        pro.cafe();
                        break;        
                }
                }
                while(opcion3!=0);
                break;
            case 4:
                comp.cancelDinero();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        }
    }while(opcion1!=0);
    }
    
    }
    
