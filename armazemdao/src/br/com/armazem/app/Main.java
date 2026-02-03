/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.armazem.app;

import br.com.armazem.dao.ArmazemDAO;
import br.com.armazem.model.Armazem;

import java.util.Scanner;
/**
 *
 * @author ARTHURANDREMULLER
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArmazemDAO dao = new ArmazemDAO();
        
        System.out.println("Quantos produtos deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o nome do produto " + i + " :");
            String nome = sc.nextLine();
            
            System.out.println("Digite o setor que o produto " + i + " se designara: ");
            String setor = sc.nextLine();
            
            System.out.println("Digite o preco do produto " + i + " :");
            Double preco = sc.nextDouble();
            
            Armazem armazem = new Armazem(nome, setor, preco);
            
            dao.cadastrar(armazem);
        }
        
        System.out.println("\n === PRODUTOS CADASTRADOS ===");
        dao.listar().forEach(Armazem -> {
            System.out.println(Armazem.getId() + " - " + Armazem.getNome() + " - " + Armazem.getSetor() + " - " + Armazem.getPreco());
        });
        
        sc.close();
    }
}
