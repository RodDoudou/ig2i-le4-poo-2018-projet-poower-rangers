package dao;

/**
 * TODO.
 * @author Admin
 */
public class DaoFactoryJpa extends DaoFactory {

    @Override
    public ChariotDao getChariotDao() {
        return JpaChariotDao.getInstance();
    }

    @Override
    public ColisDao getColisDao() {
        return JpaColisDao.getInstance();
    }

    @Override
    public CommandeDao getCommandeDao() {
        return JpaCommandeDao.getInstance();
    }

    @Override
    public ConfigurationDao getConfigurationDao() {
        return JpaConfigurationDao.getInstance();
    }

    @Override
    public DistanceDao getDistanceDao() {
        return JpaDistanceDao.getInstance();
    }

    @Override
    public EntrepotDao getEntrepotDao() {
        return JpaEntrepotDao.getInstance();
    }

    @Override
    public LocalisationDao getLocalisationDao() {
        return JpaLocalisationDao.getInstance();
    }

    @Override
    public ProduitDao getProduitDao() {
        return JpaProduitDao.getInstance();
    }

    @Override
    public QuantiteProduitDao getQuantiteProduitDao() {
        return JpaQuantiteProduitDao.getInstance();
    }

    @Override
    public InstanceDao getInstanceDao() {
        return JpaInstanceDao.getInstance();
    }
}
