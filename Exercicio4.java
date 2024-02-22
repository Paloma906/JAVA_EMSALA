/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão 
lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e
quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a
palavrs "in" para dentro do intervalo, e "out" para fora do intervalo).

EXEMPLO:

ENTRADA:                    SAÍDA:
5                           2 in
14                          3 out
123
10
-25
32
 */

package com.mycompany.exercicio4;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int dentroIntervalo =0;
        int foraIntervalo= 0;
        
        
        int n = sc.nextInt();
        
        for (int i=0;i<n;i++){
            
            int x = sc.nextInt();
            
            if (x >= 10 && x <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        
        }
        
        System.out.println(dentroIntervalo +  " :in");
        System.out.println(foraIntervalo  + " :out");
        
        sc.close();

    }
}
