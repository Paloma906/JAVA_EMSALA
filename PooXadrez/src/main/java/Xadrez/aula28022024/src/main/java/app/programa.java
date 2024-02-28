/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import entidade.funcionario;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Aluno
 */
public class programa {

    public static void main(String[] args) {
       
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        funcionario Funcionario = new funcionario();
        
        System.out.println("Nome");
        Funcionario.nome = sc.nextLine();
        
        System.out.println("SalárioBruto");
        Funcionario.salarioBruto = sc.nextDouble();
        
        System.out.println("Imposto");
        Funcionario.imposto = sc.nextDouble(); 
        System.out.println();
        
        System.out.println("Funcionario" + Funcionario);
        System.out.println();
        
        System.out.println("Qual o percentual de aumento de salário: ");
        double percentual = sc.nextDouble();
        Funcionario.aumentarSalario(percentual);
        System.out.println();
        
        System.out.println("Dados Atualizados: " + Funcionario);
        
    }
}
