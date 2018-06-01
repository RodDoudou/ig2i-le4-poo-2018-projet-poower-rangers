/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Commande;

/**
 *
 * @author Rod
 */
public class JpaCommandeDao extends JpaDao<Commande> implements CommandeDao{
    
    private static JpaCommandeDao instance;
    
    public JpaCommandeDao() {
        super(Commande.class);
    }
    
    
    public static JpaCommandeDao getInstance() {
            if (instance == null) {
                    instance = new JpaCommandeDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Commande> findAll() {
            return super.findAll();
    }

    @Override
    public Commande find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Commande obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Commande obj) {
            return super.create(obj);
    }
}
