/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.entidade;

import br.rj.macae.femass.artcenter.entidade.OrdemServico_Material;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author YMoraes
 */
@Entity
public class OrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String data;
    private String projeto;
    private String tecnico;
    private String comentario;
    private Cliente cliente;
    private Equipamento equipamento;
    @OneToMany (mappedBy = "ordemservico" ,targetEntity = OrdemServico_Material.class)
    private List<OrdemServico_Material> materiais;

    public List<OrdemServico_Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<OrdemServico_Material> materiais) {
        this.materiais = materiais;
    }
    

    public OrdemServico(Integer id) {
        this.id = id;
        materiais = new ArrayList<OrdemServico_Material>();
    }
    
    public OrdemServico() {
        materiais = new ArrayList<OrdemServico_Material>();
    }
    
        
    public List<OrdemServico_Material> getMaterial(){
        return Collections.unmodifiableList(materiais);
    }
    public void setMaterial(OrdemServico_Material material){
        this.materiais.add(material);
    }
    public void removeMaterial(OrdemServico_Material material){
        if(this.materiais.contains(material))
            this.materiais.remove(material);
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.rj.macae.femass.artcenter.entidade.OrdemServico[ id=" + id + " ]";
    }
    
}
