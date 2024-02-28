/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.funcionario to edit this template
 */
package entidade;

/**
 *
 * @author Aluno
 */
public class funcionario {
    
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioLiquido(){
    return salarioBruto - imposto;
    }
     
    public void aumentarSalario(double percentual){
    salarioBruto += (salarioBruto * percentual)/100;
    }
    
    public String toString(){
    return nome + "R$" + String.format("%.2f", salarioLiquido());
    }
    
        
     
       
    
    }
  
