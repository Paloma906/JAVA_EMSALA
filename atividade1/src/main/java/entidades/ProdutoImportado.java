/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aluno
 */
public class ProdutoImportado extends produto {
    private double taxa;
    
    public ProdutoImportado(String nome, double preco,double taxa) {
        super(nome, preco);
        this.taxa=taxa;
    }
    
}
