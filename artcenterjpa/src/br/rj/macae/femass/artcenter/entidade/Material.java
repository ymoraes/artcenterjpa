/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.entidade;

import br.rj.macae.femass.artcenter.entidade.OrdemServico_Material;
import java.io.Serializable;
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
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String material;
    private String modelo;
    @OneToMany (mappedBy = "material" ,targetEntity = OrdemServico_Material.class)
    private List<OrdemServico_Material> os;

    public List<OrdemServico_Material> getOs() {
        return os;
    }

    public void setOs(List<OrdemServico_Material> os) {
        this.os = os;
    }
    

    public List<OrdemServico_Material> getOS(){
        return Collections.unmodifiableList(os);
    }
    public void setOS(OrdemServico_Material ordem){
        this.os.add(ordem);
    }
    public void removeOS(OrdemServico_Material ordem){
        if(this.os.contains(ordem))
            this.os.remove(ordem);
    }
    
   

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof Material)) {
            return false;
        }
        Material other = (Material) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
