/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.dao;


import br.rj.macae.femass.artcenter.entidade.Material;
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
public class MaterialDAO implements IDAO{

    @Override
    public void cadastrar(Object o) throws SQLException {
        
        
            Material c = (Material)o;
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            em.close();

    }

     @Override
    public void alterar(Object o) throws SQLException {
        Material material = (Material) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(material);
        em.getTransaction().commit();
        em.close();
      
           
    }

     @Override
    public void excluir(Object o) throws SQLException {
        Material material = (Material) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        material = em.merge(material);
        em.remove(material);
        em.getTransaction().commit();
        em.close();
        
    }

     @Override
    public List listarTodos() throws SQLException {
        
        try {
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            TypedQuery<Material> consulta = em.createQuery("SELECT c FROM Material c",Material.class);
            List<Material> materials = consulta.getResultList();
            em.close();
            return materials;
                        
        } catch (Exception e) {
            throw new SQLException("Eroo ao tentar listar a material. \n" + e.getMessage());
        }
        
    }

     @Override
    public Object listarPorId(int id) throws SQLException {
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        Material r = em.find(Material.class, new Integer(id));        
        em.close();
        return r;

    }
    
}
