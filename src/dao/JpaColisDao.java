/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Colis;

/**
 *
 * @author Rod
 */
public class JpaColisDao extends JpaDao<Colis> implements ColisDao{
    
    private static JpaColisDao instance;
    
    public JpaColisDao() {
        super(Colis.class);
    }
    
    public static JpaColisDao getInstance() {
            if (instance == null) {
                    instance = new JpaColisDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Colis> findAll() {
            return super.findAll();
    }

    @Override
    public Colis find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Colis obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Colis obj) {
            return super.create(obj);
    }
    
}
