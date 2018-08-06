package com.rci.ptcp.springbatch.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rci.ptcp.springbatch.model.CodigosPostales;

@Repository("codigosPostalesDAO")
@Transactional
public class CodigosPostalesDAO {
	
	@Autowired
	private HibernateSessionFactory hibernateSessionFactory;
	
	private Session session;
	
	private static Logger logger = Logger.getLogger(CodigosPostalesDAO.class.getName());
	
	/**
	 * findAllCodigosPostales -
	 * 
	 * This method should return all records in the table PFNET_ADM.TPTCP00
	 * 
	 * @return List with all records in the table PFNET_ADM.TPTCP00
	 */
    @SuppressWarnings("unchecked")
	public List<CodigosPostales> findAllCodigosPostales() {
        
		session = hibernateSessionFactory.getSession();
		
		List<CodigosPostales> result;
		
        result = (List<CodigosPostales>) this.session.createQuery("SELECT a FROM CodigosPostales a").list();
        
        try {
        	session.clear();
        } catch (Exception e) {
        	logger.debug(e.getStackTrace().toString());
        }
        
        return result;
    }
    
    /**
	 * findRecord -
	 * 
	 * This method will seek the item in the table PFNET_ADM.TPTCP00
	 * 
	 * @param item - Item to seek
	 * 
	 * @return The item seeking or null
	 */
    @SuppressWarnings("unchecked")
	public List<CodigosPostales> findRecords(CodigosPostales item) {
    	List<CodigosPostales> result = null;
    	
    	session = hibernateSessionFactory.getSession();
    	
    	String consulta = "  SELECT cp "
    			        + "    FROM CodigosPostales cp "
    			        + "   WHERE cp.dd = :dd "
    			        + "     AND cp.cc = :cc "
    			        + "     AND cp.llll = :llll "
    			        + "     AND cp.localidade = :localidade "
    			        + "     AND cp.art_cod = :art_cod "
    			        + "     AND cp.cp4 = :cp4 "
    			        + "     AND cp.cp3 = :cp3 "
    			        + "     AND cp.cpalf = :cpalf ";
    
    	boolean isNullItemArtCod = (item.getArt_cod() == null || item.getArt_cod().length() == 0);
    	
    	if (isNullItemArtCod) {
    		consulta = consulta.replace("AND cp.art_cod = :art_cod", "AND cp.art_cod IS NULL ");
    	}
    	
    	Query query = session.createQuery(consulta)
    			.setParameter("dd", item.getDd())
    			.setParameter("cc", item.getCc())
    			.setParameter("llll", item.getLlll())
    			.setParameter("localidade", item.getLocalidade())
    			.setParameter("cp4", item.getCp4())
    			.setParameter("cp3", item.getCp3())
    			.setParameter("cpalf", item.getCpalf());
    	
    	if (!isNullItemArtCod) {
    		query.setParameter("art_cod", item.getArt_cod());
    	}
    	
    	result = (List<CodigosPostales>) query.list();
    	
    	try {
        	session.clear();
        } catch (Exception e) {
        	logger.debug(e.getStackTrace().toString());
        }
    	return result;
    }

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public HibernateSessionFactory getHibernateSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setHibernateSessionFactory(HibernateSessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

}
