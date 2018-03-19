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
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int numdiv = 0;
        System.out.print("Limite de numeros positivos:");
        int limite = scanner.nextInt();
        if(limite < 1000){
            for (numero = 1; numero <= limite; numero++) {
                int contador = 0;
                for (numdiv = numero; numdiv >= 1; numdiv--) {
                    if (numero % numdiv == 0) {
                        contador = contador + 1;
                    }
                }
                if (contador == 2) {
                    System.out.print("["+numero+"]");
                }
            }
        }else{
            System.out.print("Limite é de 1000 numeros positivos!");
        }
    }
}
