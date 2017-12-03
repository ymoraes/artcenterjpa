/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anamm
 */
public class FabricaConexao {
    public static EntityManagerFactory getConexao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("artcenterjpaPU");
        return emf;
    }
}
