/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.Escreva um algortimo para ler
 * o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool, 2.Gasolina, 3.Diesel. 4.Fim).Caso o usuário informe um código inválido
 * (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O program será encerrado quando o código informado for o número 4.
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo d combustível, conforme exemplo.
 * 
 * EXEMPLO:
 * 
 * ENTRADA:                         SAÍDA:
 * 8                                MUITO OBRIGADO.
 * 1                                Alcool: 1
 * 7                                Gasolina: 2
 * 2                                Diesel: 0
 * 2
 * 4
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        int codigo;
        
        do{
            
            System.out.println("Digite o codigo:");
            codigo = sc.nextInt();
        
        
        }while(codigo >=5);
        
        if (codigo == 1){
        
            System.out.println("Alcool");
        }else if (codigo == 2){
            
            System.out.println("gasolina");
        }else if (codigo == 3){
            System.out.println("Diesel");
        }else{
            System.out.println("MUITO OBRIGADO");
        }
        
        
        
        
        
        sc.close();
        
        
        
        
    }
    
}
