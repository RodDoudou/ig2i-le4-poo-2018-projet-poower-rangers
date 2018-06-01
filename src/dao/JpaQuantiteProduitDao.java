/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.QuantiteProduit;

/**
 *
 * @author Rod
 */
public class JpaQuantiteProduitDao extends JpaDao<QuantiteProduit> implements QuantiteProduitDao{
    
    private static JpaQuantiteProduitDao instance;
    
    public JpaQuantiteProduitDao() {
        super(QuantiteProduit.class);
    }
    
    public static JpaQuantiteProduitDao getInstance() {
            if (instance == null) {
                    instance = new JpaQuantiteProduitDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<QuantiteProduit> findAll() {
            return super.findAll();
    }

    @Override
    public QuantiteProduit find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(QuantiteProduit obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(QuantiteProduit obj) {
            return super.create(obj);
    }
}
