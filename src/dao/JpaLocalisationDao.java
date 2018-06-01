/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;
import metier.Localisation;

/**
 *
 * @author Rod
 */
public class JpaLocalisationDao extends JpaDao<Localisation> implements LocalisationDao{
    
    private static JpaLocalisationDao instance;
    
    public JpaLocalisationDao() {
        super(Localisation.class);
    }
    
    public static JpaLocalisationDao getInstance() {
            if (instance == null) {
                    instance = new JpaLocalisationDao();
            }
            return instance;
    }
    
    @Override
    public boolean deleteAll() {
            return super.deleteAll();
    }

    @Override
    public Collection<Localisation> findAll() {
            return super.findAll();
    }

    @Override
    public Localisation find(Integer id) {
            return super.find(id);
    }

    @Override
    public void close() {
            super.close();
    }
    @Override
    public boolean update(Localisation obj) {
            return super.update(obj);
    }

    @Override
    public boolean create(Localisation obj) {
            return super.create(obj);
    }
}
