/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploforvetor;
import javax.swing.JOptionPane;

/**
 *
 * @author 82317363
 */
public class ExemploforVetor {

    public static void main(String[] args) {
             int numeroAlunos = 5;
        double notas1[] = new double[numeroAlunos];
        double notas2[] = new double[numeroAlunos];
        double medias[] = new double[numeroAlunos];
         String nome [] = new String[numeroAlunos];

        for (int contador = 0; contador < numeroAlunos; contador++) {
            nome[contador] = JOptionPane.showInputDialog("Insira o nome do Aluno");
            notas1[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
            notas2[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
            medias[contador] = (notas1[contador] + notas 2[contador]) / 2;
        }
        
            String res = "Notas finais dos alunos:\n";  
            for (int i = 0; i < numeroAlunos; i++) {
                JOptionPane.showMessageDialog(null, "A nota final do aluno " + nome[i] + " é " + medias[i]);
                res += "Aluno: " + nome[i] + " Média " + medias[i] + "\n"; 
            
        }
            JOptionPane.showMessageDialog(null,res);
            
    }

}
   
