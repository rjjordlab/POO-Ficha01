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
public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Area triangulo");
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Base: ");
        double base = teclado.nextDouble();
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        
        double area = (base * altura) / 2;
        System.out.println("Area= "+ area);
    }
}
