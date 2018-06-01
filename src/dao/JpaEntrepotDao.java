/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Entrepot;

/**
 *
 * @author Rod
 */
public class JpaEntrepotDao extends JpaDao<Entrepot> implements EntrepotDao{
    
    private static JpaEntrepotDao instance;
    
    public JpaEntrepotDao() {
        super(Entrepot.class);
    }
    
    public static JpaEntrepotDao getInstance() {
            if (instance == null) {
                    instance = new JpaEntrepotDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Entrepot> findAll() {
            return super.findAll();
    }

    @Override
    public Entrepot find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Entrepot obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Entrepot obj) {
            return super.create(obj);
    }
}
