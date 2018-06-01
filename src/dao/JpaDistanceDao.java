/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Distance;

/**
 *
 * @author Rod
 */
public class JpaDistanceDao extends JpaDao<Distance> implements DistanceDao{
    private static JpaDistanceDao instance;
    
    public JpaDistanceDao() {
        super(Distance.class);
    }
    
    public static JpaDistanceDao getInstance() {
            if (instance == null) {
                    instance = new JpaDistanceDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Distance> findAll() {
            return super.findAll();
    }

    @Override
    public Distance find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Distance obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Distance obj) {
            return super.create(obj);
    }
    
}
