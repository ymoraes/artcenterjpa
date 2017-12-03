/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.controle;


import br.rj.macae.femass.artcenter.dao.CategoriaDAO;
import br.rj.macae.femass.artcenter.entidade.Categoria;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author anamm
 */
public class CategoriaControle{
    public void gravar(Categoria c)throws SQLException{
        CategoriaDAO dao = new CategoriaDAO();
        try{
        if(c.getId()==null || c.getId()<=0)
            dao.cadastrar(c);
        else
            dao.alterar(c);
        }catch(SQLException ex){
            throw new SQLException("Erro ao salvar as informações: \n"+ex.getMessage());
        }
    }
    public void excluir(Categoria c)throws SQLException{
        if(JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esta cliente?")==JOptionPane.YES_OPTION){
            CategoriaDAO dao = new CategoriaDAO();    
            dao.excluir(c);
        }
        
    }
    public void excluir(Long id)throws SQLException{
        if(JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esta cliente?")==JOptionPane.YES_OPTION){
            CategoriaDAO dao = new CategoriaDAO();    
            dao.excluir(id);
        }
    }
    public void atualizarLista(JTable tabela) throws SQLException{
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        TableColumnModel modeloDaColuna = tabela.getColumnModel();
        modeloDaColuna.getColumn(0).setMaxWidth(25);

        //limpa as linhas da tabela.
        model.setNumRows(0);
        CategoriaDAO dao = new CategoriaDAO();
        List clientes = dao.listarTodos();

        //Adiciona as linhas
        for (Object o : clientes){
            Categoria c = (Categoria) o;
            
            model.addRow(new Object[]{c.getId(),c.getNome()});
            
        }
        
        
    }

    public Categoria getCategoriaPorId(int id) throws SQLException {
        CategoriaDAO dao = new CategoriaDAO();
        Categoria c = (Categoria)dao.listarPorId(id);
        return c;       
    }
}
