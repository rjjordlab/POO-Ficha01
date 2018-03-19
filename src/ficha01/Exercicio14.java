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
public class Exercicio14 {
    public static long fact(int a){
        int f = 1;
        for(int k=2;k<=a; k++){
            f*=k;
        }
        return f;
                
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = teclado.nextInt();
        System.out.println(n+" != "+ fact(n));
    }
}
