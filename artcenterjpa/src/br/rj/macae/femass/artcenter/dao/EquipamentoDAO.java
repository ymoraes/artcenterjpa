/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.dao;


import br.rj.macae.femass.artcenter.entidade.Equipamento;
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
public class EquipamentoDAO implements IDAO{

    @Override
    public void cadastrar(Object o) throws SQLException {
        
        
            Equipamento c = (Equipamento)o;
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            em.close();

    }

     @Override
    public void alterar(Object o) throws SQLException {
        Equipamento equipamento = (Equipamento) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(equipamento);
        em.getTransaction().commit();
        em.close();
      
           
    }

     @Override
    public void excluir(Object o) throws SQLException {
        Equipamento equipamento = (Equipamento) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        equipamento = em.merge(equipamento);
        em.remove(equipamento);
        em.getTransaction().commit();
        em.close();
        
    }

     @Override
    public List listarTodos() throws SQLException {
        
        try {
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            TypedQuery<Equipamento> consulta = em.createQuery("SELECT c FROM Equipamento c",Equipamento.class);
            List<Equipamento> equipamentos = consulta.getResultList();
            em.close();
            return equipamentos;
                        
        } catch (Exception e) {
            throw new SQLException("Eroo ao tentar listar a equipamento. \n" + e.getMessage());
        }
        
    }

     @Override
    public Object listarPorId(int id) throws SQLException {
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        Equipamento r = em.find(Equipamento.class, new Integer(id));        
        em.close();
        return r;

    }
    
    
}
