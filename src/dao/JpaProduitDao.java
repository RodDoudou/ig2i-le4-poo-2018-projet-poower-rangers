/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Produit;

/**
 *
 * @author Rod
 */
public class JpaProduitDao extends JpaDao<Produit> implements ProduitDao{
    
    private static JpaProduitDao instance;
    
    public JpaProduitDao() {
        super(Produit.class);
    }
    
    public static JpaProduitDao getInstance() {
            if (instance == null) {
                    instance = new JpaProduitDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Produit> findAll() {
            return super.findAll();
    }

    @Override
    public Produit find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Produit obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Produit obj) {
            return super.create(obj);
    }
}
