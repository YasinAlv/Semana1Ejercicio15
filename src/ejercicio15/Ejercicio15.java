/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Num;

        System.out.println("Digite un número: ");
        Num= Teclado.nextInt();
        
        if (Num<0)
            do {
                System.out.println("El valor no es mayor o igual a 0");
                System.out.println("Digite un número: ");
                Num= Teclado.nextInt();
                
            } while (Num<0);
        
    }
    
}
