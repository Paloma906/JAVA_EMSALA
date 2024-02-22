/*
Leia um valor inteiro X (1 <= X <=100). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.

EXEMPLO:                 SAÍDA:
8                        1
                         3
                         5
                         7
 */

package com.mycompany.exercicio3;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro: ");
        int n= sc.nextInt();
        
        for(int i=1;i<n;i++){
            
            if (i % 2 != 0){
            System.out.println("Os valores ímpares desse número é: " + i);
            }
            
        
        }
    }
}
