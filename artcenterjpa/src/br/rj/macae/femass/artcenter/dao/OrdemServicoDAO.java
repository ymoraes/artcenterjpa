/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.dao;


import br.rj.macae.femass.artcenter.entidade.Cliente;
import br.rj.macae.femass.artcenter.entidade.OrdemServico;
import br.rj.macae.femass.artcenter.entidade.Material;
import br.rj.macae.femass.artcenter.entidade.OrdemServico;
import br.rj.macae.femass.artcenter.entidade.OrdemServico_Material;
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
 * @author ymoraes
 */
public class OrdemServicoDAO implements IDAO{

    @Override
    public void cadastrar(Object o) throws SQLException {
        
        
            OrdemServico c = (OrdemServico)o;
            EntityManager em = FabricaConexao.getConexao().createEntityManager();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            em.close();

    }

     @Override
    public void alterar(Object o) throws SQLException {
        OrdemServico equipamento = (OrdemServico) o;               
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(equipamento);
        em.getTransaction().commit();
        em.close();
      
           
    }

     @Override
    public void excluir(Object o) throws SQLException {
        OrdemServico equipamento = (OrdemServico) o;               
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
            TypedQuery<OrdemServico> consulta = em.createQuery("SELECT c FROM OrdemServico c",OrdemServico.class);
            List<OrdemServico> equipamentos = consulta.getResultList();
            em.close();
            return equipamentos;
                        
        } catch (Exception e) {
            throw new SQLException("Eroo ao tentar listar a equipamento. \n" + e.getMessage());
        }
        
    }

     @Override
    public Object listarPorId(int id) throws SQLException {
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        OrdemServico r = em.find(OrdemServico.class, new Integer(id));        
        em.close();
        return r;

    }
    
//    private void recuperarMateriais(OrdemServico r) throws SQLException{
//        Connection conn = null;
//        MaterialDAO dao = new MaterialDAO();
//        try {
//            conn = FabricaConexao.getConexao();
//            String sql = "SELECT os, material, quantidade, unidade\n" +
//"	FROM public.ordemservico_material WHERE os=?;";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setLong(1, r.getId());
//            ResultSet rs = stmt.executeQuery();
//            while(rs.next()){            
//                OrdemServico_Material material = new OrdemServico_Material();
//                material.setOs(r);
//                material.setQuantidade(rs.getFloat("quantidade"));
//                material.setUnidade(rs.getString("unidade"));
//                material.setMaterial((Material)dao.listarPorId(rs.getInt("material")));
//                r.setMaterial(material);
//            }
//
//            rs.close();
//            stmt.close();
//            
//            
//        } catch (SQLException e) {
//            throw new SQLException("Eroo ao recuperar material da receita. \n" + e.getMessage());
//        }
//    }
}
