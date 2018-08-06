package com.rci.ptcp.springbatch;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//import java.util.Properties;
//import java.util.PropertyResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class CodigosPostalesJobListener implements JobExecutionListener {
	
	private static Logger logger = Logger.getLogger(CodigosPostalesJobListener.class.getName());
	
	private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	@Override
	public void afterJob(JobExecution jobExecution) {
		Date stopTime = new Date();
		logger.info("Job de carga de los CPs de Portugal, se actualiza la tabla PFNET_ADM.TPTCP00, ACABA en:"+dateFormat.format(stopTime));
         
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
        	logger.debug("CodigosPostales job completed successfully");
            //Here you can perform some other business logic like cleanup
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
            logger.error("CodigosPostales job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                logger.error("exception :" +th.getLocalizedMessage());
            }
        }
    
	}

	@Override
	public void beforeJob(JobExecution jobExecution) {
		Date startTime = new Date();
        logger.info("Job de carga de los CPs de Portugal, se actualiza la tabla PFNET_ADM.TPTCP00, COMIENZA en:"+dateFormat.format(startTime));
        //this.setConfigProperties();
        //logger.info("Se ha inicializado las propiedades de la configuración");

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
    //private void setConfigProperties() {
    	/*
//		 * NOTA: Para que esto funcione hay que tener dicha variable en la JVM que ejecuta dicho proyecto
//		 * 
//		 * Para eso en Eclipse:
//		 * 	1) Windows > Preference
//		 *  2) Apartado "Installed JREs"
//		 *  3) Seleccionamos en la lista el JRE que esté marcado y pulsamos el botón "Edit"
//		 *  4) Y en la ventana "Edit JRE" en el campo "Default VM arguments" pondremos:
//		 *  		-Duvrci.ht5.flexpath=D:\Public\Configuraciones\config_abaco\flex.properties
//		 * */
    	//String path = System.getProperty ("uvrci.ht5.flexpath");
    	//try {
			//PropertyResourceBundle pFlex = new PropertyResourceBundle( new FileInputStream ( path));
			
			//Properties pConfig = new Properties();
			//FileOutputStream fos = new FileOutputStream("classpath:config.properties");
			
			//pConfig.setProperty("jdbc.driverClassName", pFlex.getString("oracle.driver"));
			//pConfig.setProperty("jdbc.url", pFlex.getString("oracle.url"));
			//pConfig.setProperty("jdbc.username", pFlex.getString("oracle.userpt"));
			//pConfig.setProperty("jdbc.password", pFlex.getString("oracle.passwordpt"));
			//pConfig.setProperty("file.codigosPostales", pFlex.getString("file.codigosPostales"));
			
			//writing properites into properties file from Java
			//pConfig.store(fos, "Properties file generated from Java program");
	        
		//} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//logger.error(e.getStackTrace().toString());
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//logger.error(e.getStackTrace().toString());
		//} catch (Exception e) {
			//e.printStackTrace();
			//logger.error(e.getStackTrace().toString());
		//}
		
    //}

}
