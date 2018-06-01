/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import metier.Chariot;

/**
 *
 * @author Rod
 */
public class JpaChariotDao extends JpaDao<Chariot> implements ChariotDao{
    
    private static JpaChariotDao instance;
    
    public JpaChariotDao() {
        super(Chariot.class);
    }
    
    public static JpaChariotDao getInstance() {
            if (instance == null) {
                    instance = new JpaChariotDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Chariot> findAll() {
            return super.findAll();
    }

    @Override
    public Chariot find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Chariot obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Chariot obj) {
            return super.create(obj);
    }
}
