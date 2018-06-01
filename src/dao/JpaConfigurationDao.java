/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Configuration;

/**
 *
 * @author Rod
 */
public class JpaConfigurationDao extends JpaDao<Configuration> implements ConfigurationDao{
    
    private static JpaConfigurationDao instance;
    
    public JpaConfigurationDao() {
        super(Configuration.class);
    }
    
    public static JpaConfigurationDao getInstance() {
            if (instance == null) {
                    instance = new JpaConfigurationDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Configuration> findAll() {
            return super.findAll();
    }

    @Override
    public Configuration find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Configuration obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Configuration obj) {
            return super.create(obj);
    }
}
