/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.armazem.model;

/**
 *
 * @author ARTHURANDREMULLER
 */
public class Armazem {
    
    private int id;
    private String nome;
    private String setor;
    private Double preco;
    
    public Armazem() {
        
    }
    
    public Armazem(String nome, String setor, Double preco){
        this.nome = nome;
        this.setor = setor;
        this.preco = preco;
    }
    
    public Armazem(int id,String nome, String setor, Double preco){
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.preco = preco;
    } 
    
    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Double getPreco(){
        return preco;
    }
    
    public void setPreco(String Double){
        this.preco = preco;
    }
}
