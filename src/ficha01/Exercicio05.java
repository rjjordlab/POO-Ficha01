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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Um numero inteiro: ");
        int i = teclado.nextInt();
        if(i % 2 == 0)System.out.println("Par"); else System.out.println("Impar");
    }
}
