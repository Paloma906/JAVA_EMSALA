/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Teste;

import Xadrez.Bispo;
import Xadrez.Cavalo;
import Xadrez.Peao;

/**
 *
 * @author Aluno
 */
public class PooXadrez {

    public static void main(String[] args) {
        
        Peao peao = new Peao();
        Bispo bispo = new Bispo();
        Cavalo cavalo = new Cavalo();
        
       peao.mover();
       bispo.mover();
       cavalo.mover();
       
    }
}
