/*
Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido(codificado da seguinte forma: 1.Alcool,
2.Gasolina, 3.Diesel, 4.Fim).Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado
for o número 4. Deve ser escrito a mensagem "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
cada tipo de combustível, conforme exemplo.

ENTRADA:                 SAÍDA:
8                        MUITO OBRIGADO
1                        Alcool: 1
7                        Gasolina: 2
2                        Diesel: 0
2
4

 */

package com.mycompany.exercicio2;

import java.util.Scanner;




public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int alcool =0;
        int gasolina =0;
        int diesel =0;
        
        int codigo;
        
        System.out.println("Digite o codigo de preferência: ");
        codigo = sc.nextInt();
        
        while(codigo !=4){
            
            if(codigo == 1){
                alcool++;
                System.out.println("Quantidade de Alcool: "+alcool);
                
            }else if (codigo == 2){
                
                gasolina++;
                System.out.println("Quantidade de Gasolina: " + gasolina);
            }else if(codigo ==3){
                
                diesel++;
                System.out.println("Quantidade de Diesel: " +diesel);
            }else{
                System.out.println("Código Inválido!");
                
            }
            
            codigo = sc.nextInt();
            System.out.println("MUITO OBRIGADO");
            
            
    
        }
        
         sc.close();
        
    }
}
