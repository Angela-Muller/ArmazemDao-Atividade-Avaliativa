/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.armazem.dao;
import br.com.armazem.config.ConnectionFactory;
import br.com.armazem.model.Armazem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ARTHURANDREMULLER
 */
public class ArmazemDAO {
    public void cadastrar(Armazem armazem) {
        String sql = "INSERT INTO armazem (nome, setor, preco) VALUES (?,?,?)";
        
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, armazem.getNome());
            stmt.setString(2, armazem.getSetor());
            stmt.setDouble(3, armazem.getPreco());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar o produto", e);
        }
    }
    
    public List<Armazem> listar(){
        String sql = "SELECT id, nome, setor, preco From armazem";
        
        List<Armazem> armazems = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String setor = rs.getString("setor");
                Double preco = rs.getDouble("preco");
                
                Armazem armazem = new Armazem(id, nome, setor, preco);
                
                armazems.add(armazem);
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar os Produtos", e);
        }
        return armazems;
    }
}
