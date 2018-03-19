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
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o sexo M / F: ");
        String sexo = teclado.nextLine();

        switch (sexo) {
            case "M":
            case "m":
                System.out.println("Masculino");
                break;
            case "F":
            case "f":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo Indefinido");
        }
    }
}
