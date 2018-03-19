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
public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Média de três numeros");
    Scanner teclado = new Scanner(System.in);
    //pedir prim numero int
        System.out.print("Numero 1: ");
        //ler numero
        int n1 = teclado.nextInt();
    //pedir prim numero int
        System.out.print("Numero 2: ");
        //ler numero
        int n2 = teclado.nextInt();
    //pedir prim numero int
        System.out.print("Numero 3: ");
        //ler numero
        int n3 = teclado.nextInt();
    //calcular media
        double media = ((n1+n2+n3)/3.0);
        //imprimir media
        System.out.printf("A media é %f \n", media);
    }
}
