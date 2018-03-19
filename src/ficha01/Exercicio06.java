/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha01;

import java.util.Scanner;

/**
 *
 * @author USER01
 */
public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Numero e pos, neg,nulo?");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        int i = teclado.nextInt();
        if (i < 0) System.out.println("Numero negativo.");
        if (i > 0) System.out.println("Numero positivo.");
        if (i == 0) System.out.println("Numero nulo.");
    }
}
