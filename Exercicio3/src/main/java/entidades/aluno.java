/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aluno
 */
public class aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double totalNotas(){
    return (nota1 + nota2 + nota3);
    }
    
    public void situacao(){
        
        if (totalNotas() >=60){
            System.out.println("PASS");
            
        }else{
            System.out.println("FAILED");
            System.out.println("Faltam " + String.format("%.2f", 60 - totalNotas()));
        
        }
        
    }
}
