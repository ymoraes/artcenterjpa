/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.dao;


import br.rj.macae.femass.artcenter.entidade.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author anamm
 */
public class CategoriaDAO implements IDAO{

    @Override
    public void cadastrar(Object o) throws SQLException {
        
        
            Categoria c = (Categoria)o;
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            em.close();
            
//            String sql = "insert into cliente (nome,descricao) "
//                    + "values (?,?)";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            // preenche os valores         
//            stmt.setString(1, cliente.getNome());
//            stmt.setString(2, cliente.getDescricao());
//            
//            
//            stmt.executeUpdate();
//            stmt.close();
//            conn.close();
        
    }

     @Override
    public void alterar(Object o) throws SQLException {
        Categoria cliente = (Categoria) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        em.close();
      
           
    }

     @Override
    public void excluir(Object o) throws SQLException {
        Categoria cliente = (Categoria) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        cliente = em.merge(cliente);
        em.remove(cliente);
        em.getTransaction().commit();
        em.close();
        
    }

     @Override
    public List listarTodos() throws SQLException {
        
        try {
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            TypedQuery<Categoria> consulta = em.createQuery("SELECT c FROM Categoria c",Categoria.class);
            List<Categoria> clientes = consulta.getResultList();
            em.close();
            return clientes;
                        
        } catch (Exception e) {
            throw new SQLException("Eroo ao tentar listar a cliente. \n" + e.getMessage());
        }
        
    }

     @Override
    public Object listarPorId(int id) throws SQLException {
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        Categoria r = em.find(Categoria.class, new Integer(id));        
        em.close();
        return r;

    }
    
}
