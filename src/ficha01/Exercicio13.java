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
public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Formula: delta = b^2 -(4.a.c)");
        Scanner teclado = new Scanner(System.in);

        System.out.print("a= ");
        double a = teclado.nextDouble();
        System.out.print("b= ");
        double b = teclado.nextDouble();
        System.out.print("c= ");
        double c = teclado.nextDouble();
        
        System.out.println("Equação: delta = "+b+"^2 -(4*"+a+"*"+c+")");
        
        double delta = b*b;
        double aux = a*c; aux = 4 * aux;        
        delta = delta - aux;
        System.out.println("delta= "+delta);
        
        if(delta < 0){
            System.out.println("Nenhuma raiz real: quando delta for menor que zero. (negativo)");
        }else{
            if(delta == 0){
                System.out.println("Uma única raiz real: quando delta for igual a zero. (nulo)");
            }else{
                if(delta > 0){
                    System.out.println("Duas raízes reais: quando delta for maior que zero. (positivo) ");
                }
            }
            
            
        }
        
        
    }
}
