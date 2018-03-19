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
public class Exercicio16 {
    public static void main(String[] args) {
        System.out.println("*NUMERO PERFEITO*");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inserir numero: ");
        int numero = teclado.nextInt();
        
        int calcsum=0;
        int verifdiv=0;
        System.out.print(numero+" = ");
        for(int i=1;i<=numero;i++){
            verifdiv= numero % i;
            if(verifdiv == 0 && i != numero){
                if(i==1){
                    System.out.print(i);
                    calcsum+=i;
                }else{
                    System.out.print(" + "+i);
                    calcsum+=i;
                }
            } 
        }
        //System.out.println("calcsum= "+calcsum);
        
        
        
        
        
        
    }
}
