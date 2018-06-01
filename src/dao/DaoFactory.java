package dao;

/**
 * TODO.
 * @author Admin
 */
public abstract class DaoFactory {
    
	public static DaoFactory getDaoFactory(PersistenceType type) {
		if (type.equals(PersistenceType.JPA)) {
			return new DaoFactoryJpa();
		}
		return null;
	}
        
	public abstract ChariotDao getChariotDao();

	public abstract ColisDao getColisDao();
        
	public abstract CommandeDao getCommandeDao();

	public abstract ConfigurationDao getConfigurationDao();
        
	public abstract DistanceDao getDistanceDao();

	public abstract EntrepotDao getEntrepotDao();
        
	public abstract LocalisationDao getLocalisationDao();
        
	public abstract ProduitDao getProduitDao();
        
	public abstract QuantiteProduitDao getQuantiteProduitDao();

	public abstract InstanceDao getInstanceDao();

        
}
