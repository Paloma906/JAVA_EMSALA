/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import entidades.aluno;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Programa {

    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner(System.in);
        
        aluno Aluno = new aluno();
        
        System.out.println("Digite a nota 1: ");
        Aluno.nota1 = sc.nextDouble();
        
        System.out.println("Digite a nota 2: ");
        Aluno.nota2 = sc.nextDouble();
        
        System.out.println("Digite a nota 3: ");
        Aluno.nota3 = sc.nextDouble();
        
        Aluno.situacao();
        
    }
}
