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
public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("*Calculadora IMC*");
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("PESO: ");
        double peso = teclado.nextDouble();
        
        System.out.print("ALTURA: ");
        double altura = teclado.nextDouble();
        
        //comparar...
        double imc = peso / (altura * altura);
        
        if(imc < 20) System.out.println("Abaixo do peso.");
        if(imc >= 20 && imc <= 24) System.out.println("Peso ideal.");
        if(imc >= 25 && imc <= 29) System.out.println("Excesso de peso.");
        if(imc >= 30 && imc <= 39) System.out.println("Obesidade.");
        if(imc > 39) System.out.println("Obesidade mórbida.");
    }
}
