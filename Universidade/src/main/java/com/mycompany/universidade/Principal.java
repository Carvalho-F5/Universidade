/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 82317363
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        int ra_aluno;
        int id_aluno;
        String telefone_aluno;
        String nome_aluno;
     Aluno aluno =  new Aluno();
        String menu = "1-cadastrar\n 2-Atualizar\n 3-apagar\n 4-listar\n";
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("digite seu ra: "));
                    telefone_aluno = (JOptionPane.showInputDialog("Digite seu telefone:"));
                    nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
                    aluno.setRa_aluno(ra_aluno);
                    aluno.setTelefone_aluno(telefone_aluno);
                    aluno.setNome_aluno(nome_aluno);
                    aluno.inserir();
                    break;
                case 2:
                    ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("digite seu ra: "));
                    telefone_aluno = (JOptionPane.showInputDialog("Digite seu telefone:"));
                    nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
                    aluno.setRa_aluno(ra_aluno);
                    aluno.setTelefone_aluno(telefone_aluno);
                    aluno.setNome_aluno(nome_aluno);
                    aluno.atualizar();
                    break;
                case 3:
                id_aluno = Integer.parseInt(JOptionPane.showInputDialog("digite o id do aluno:"));
                        aluno.setId_aluno(id_aluno);
                        aluno.apagar();
                    
                    break;

                case 4:
                    aluno.listar();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opção inválida");
            }

        } while (opcao != 0);
    }}
