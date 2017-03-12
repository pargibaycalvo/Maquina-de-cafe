/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maqcafe;

/**
 *
 * @author ped90
 */
public class azucar {
    /**
     * azucar en 0 sera el min de cafe
     */
    private int contador=0;
   
    /**
     * botones de aumento y desaumento de azucar
     */
    public void aumentarAzucar(){
       if(contador==10) 
            System.out.println("Maximo de azucar permitido");
       else{
           contador++;
           System.out.println("Aumente el azucar al gusto"+contador);
       }
    }
    public void disminuirAzucar(){
        if(contador==0)
            System.out.println("Minimo de azucar permitido");
        else{
            contador--;
            System.out.println("Disminuya el azucar al gusto"+contador);
        }
    }
    
}
