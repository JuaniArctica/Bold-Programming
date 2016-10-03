/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import javax.swing.JOptionPane;

/**
 *
 * @author juani
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int numeroSw;
    String sNumeroSw;
    
    sNumeroSw=JOptionPane.showInputDialog("MENU\n1-Perimetro del triangulo\n2-"
            + "Calcular superficie del triangulo\n3-Calcular perimetro del cuadrado"
            + "\n4-Calcular superficie del cuadrado\n5-SALIR");
    numeroSw=Integer.parseInt(sNumeroSw);
    
        switch (numeroSw) {
            case 1:
                double lado1;
                double lado2;
                double lado3;
                           
                break;
            case 2:
                System.out.println("LA CONCHA DE TU MADRE ALL BOYS");
                break;
            case 3:
               
                break;
            case 4:
                break;
            case 5:
                break;
                
            default:
                System.out.println("opcion incorrecta");
        }
    }
    
}
