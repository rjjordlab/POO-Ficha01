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
public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("*Classificar triângulo*");
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Lado 1/3: ");
        double la = teclado.nextDouble();
        
        System.out.print("Lado 2/3: ");
        double lb = teclado.nextDouble();
        
        System.out.print("Lado 3/3: ");
        double lc = teclado.nextDouble();
        
        if(la == lb && lb == lc) {
            System.out.print("È um triângulo Equilátero."); //todos lados iguais
        }else{
            if(la == lb || lb == lc || lc == la){
                System.out.print("È um triângulo Isósceles."); // 2 lados iguais
            }else{
                if(la != lb && lb != lc && lc != la) 
                    System.out.print("È um triângulo Escaleno."); //lados todos diferentes
            }
        }       
        
    }
}
