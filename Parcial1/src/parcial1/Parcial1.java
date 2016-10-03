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

        sNumeroSw = JOptionPane.showInputDialog("MENU\n1 - Calcular perimetro del triangulo\n2 - "
                + "Calcular superficie del triangulo\n3 - Calcular perimetro del cuadrado"
                + "\n4 - Calcular superficie del cuadrado\n5 - SALIR");
        numeroSw = Integer.parseInt(sNumeroSw);

        switch (numeroSw) {
            case 1:
                double lado;
                double acumulador = 0;
                String cadenaLado;

                for (int i = 1; i <= 3; i++) {
                    cadenaLado = JOptionPane.showInputDialog(null, "Ingrese el valor de lado " + i);
                    lado = Double.parseDouble(cadenaLado);
                    acumulador = acumulador + lado;
                }
                JOptionPane.showMessageDialog(null, "El perímetro del triángulo es " + acumulador);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta, intente nuevamente");
        }
    }

}
