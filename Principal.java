
import Model.Clientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
// Control s
// control shift e seta pra baixo
// control espaço
// botão direito. Pra por get e set, vai no import code

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        // instanciando a classe Clientes
        // Criando um objeto chamado: cliente1.
        
        //Clientes cliente1 = new Clientes();
        //cliente1.setNome("Marta");
        //cliente1.setDataNascimento("10/01/1990");
        //cliente1.setEndereco("Rua A");
        
        Clientes cliente1 = new Clientes("Marta", "10/01/1990", "Rua A");
        
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Data de nascimento: " + cliente1.getDataNascimento());
        System.out.println("Endereço: " + cliente1.getEndereco());
    }
}
