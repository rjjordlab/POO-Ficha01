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
public class Exercicio02 {
    public static void main(String[] args) {
        //definir o teclado
        Scanner teclado = new Scanner(System.in);
        //pedir o nome
        System.out.print("Qual o seu nome: ");
        //ler o nome
        String nome = teclado.nextLine();
        //pedir a idade
        System.out.print("Qual a sua idade: ");
        //ler a idade
        int idade = teclado.nextInt();
        //cumprimentar o utilizador
        System.out.printf("Olá %s de %d anos.\n", nome,idade);
              
    }
}
