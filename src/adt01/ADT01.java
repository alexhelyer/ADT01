/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt01;

/**
 *
 * @author alejandro
 */
public class ADT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("Hola Mundo");
        
        Figura mifigura = new Figura();
        
        mifigura.pintarTrianguloR('*', 10);        
        
        mifigura.pintarTrianguloE('0', 10);
        
        mifigura.pintarCuadrado('*', 10);
        
        mifigura.pintarRectangulo('0', 10,5);
        
        mifigura.pintarRombo('*',10);
        
        mifigura.pintarHexagono('0', 10);
        
        mifigura.pintarTrapecio('*',10);
        
        mifigura.pintarOctagono('0',4);

    }
    
}
