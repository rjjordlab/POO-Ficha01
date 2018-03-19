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
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor n: ");
        int n = teclado.nextInt();
        System.out.print("Valor k: ");
        int k = teclado.nextInt();

        long comb = Exercicio14.fact(n) / (Exercicio14.fact(k) * Exercicio14.fact(n - k));
        System.out.println("Combinacoes = " + comb);
    }
}
