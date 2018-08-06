package com.rci.ptcp.springbatch.SpringBatchPtCpLoad;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.List;
//import java.util.Properties;
//import java.util.PropertyResourceBundle;

import org.apache.log4j.Logger;
//import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.*;
//import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

import com.rci.ptcp.springbatch.dao.CodigosPostalesDAO;
import com.rci.ptcp.springbatch.dao.HibernateSessionFactory;
//import com.rci.ptcp.springbatch.model.CodigosPostales;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-batch-context.xml"})
public class ConnectionPoolTest{

//	@Autowired
//	ApplicationContext context;
	
	@Autowired HibernateSessionFactory hibernateSessionFactory;
	
	/*Logger*/
	final static Logger logger = Logger.getLogger(ConnectionPoolTest.class.getName());
	
	@Autowired
	CodigosPostalesDAO cpsDAO;
	
	//@Before
	//public void init(){
		//this.setConfigProperties();
	//}
	
	@Test
    public void runTest(){
		
		//List<CodigosPostales> cps = cpsDAO.findAllCodigosPostales();
        
        //assertNotNull(cps);
        
        //for (CodigosPostales cp : cps) {
        	//logger.debug(cp.toString());
        //}
		
		assertTrue(true);

    }
    
    /**
     * Rellenamos las propiedades del fichero "config.properties", que usaremos para crear el DataSource
     * 
     * Con las variables:
     * 	1) oracle.driver
     *  2) oracle.url
     *  3) oracle.userpt
     *  4) oracle.passwordpt
     *  
     *  Del fichero flex.properties (Cuya ruta se define en la variable "uvrci.ht5.flexpath" de los parametros de la JVM)
     */
//    private void setConfigProperties() {
//    	/*
//		 * NOTA: Para que esto funcione hay que tener dicha variable en la JVM que ejecuta dicho proyecto
//		 * 
//		 * Para eso en Eclipse:
//		 * 	1) Windows > Preference
//		 *  2) Apartado "Installed JREs"
//		 *  3) Seleccionamos en la lista el JRE que esté marcado y pulsamos el botón "Edit"
//		 *  4) Y en la ventana "Edit JRE" en el campo "Default VM arguments" pondremos:
//		 *  		-Duvrci.ht5.flexpath=D:\Public\Configuraciones\config_abaco\flex.properties
//		 * */
//    	String path = System.getProperty ("uvrci.ht5.flexpath");
//    	try {
//			PropertyResourceBundle pFlex = new PropertyResourceBundle( new FileInputStream ( path));
//			
//			Properties pConfig = new Properties();
//			FileOutputStream fos = new FileOutputStream("classpath:config.properties");
//			
//			pConfig.setProperty("jdbc.driverClassName", pFlex.getString("oracle.driver"));
//			pConfig.setProperty("jdbc.url", pFlex.getString("oracle.url"));
//			pConfig.setProperty("jdbc.username", pFlex.getString("oracle.userpt"));
//			pConfig.setProperty("jdbc.password", pFlex.getString("oracle.passwordpt"));
//			pConfig.setProperty("file.codigosPostales", pFlex.getString("file.codigosPostales"));
//			
//			//writing properites into properties file from Java
//			pConfig.store(fos, "Properties file generated from Java program");
//	        
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			logger.error(e.getStackTrace().toString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			logger.error(e.getStackTrace().toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error(e.getStackTrace().toString());
//		}
//		
//    }
}