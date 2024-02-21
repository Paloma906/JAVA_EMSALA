/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta
informada, escrever a mensagem "Senha Invalida".Quando a senha for informada corretamente deve ser impressa a mensagem
"Acesso Permitido" e o algoritmo encerrado.Considere que a senha correta é o valor 2002.

Entrada:                                 Saída:
2200                                     Senha Invalida
1020                                     Senha Invalida
2022                                     Senha Invalida
2002                                     Acesso Permitido
 */

package com.mycompany.exercicio1;

import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int senha ;
        
        
        
        do{
            
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
            
            if(senha !=2002){
            System.out.println("Senha Invalida!");
            }
              
        
        }while (senha != 2002);
        
        System.out.println("Acesso Permitido!");
        
        sc.close();
        
      
    }
}
