package com.rci.ptcp.springbatch.SpringBatchPtCpLoad;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	
	private static Logger logger = Logger.getLogger(App.class.getName());
	
	private static App uniqueApp;
	
	private static boolean enEjecucion = false;
	
	// El constructor es privado, no permite que se genere un constructor por defecto.
	private App() {
		
	}
	
	public static App getSingletonInstance() {
		if (uniqueApp == null) {
			uniqueApp = new App();
		} else {
			logger.info("Ya existe un objeto de la clase App, que puede lanzar el job con su método launch");
		}
		
		return uniqueApp;
	}
	
	/**
	 * launchJob() -
	 * 
	 * Carga el contexto de Spring Batch para lanzar el Job que cargará los Códigos Postales de Portugal
	 * del fichero indicado en la propiedad "file.codigosPostales" del "flex.properties" 
	 * si no están ya en la tabla "PFNET_ADM.TPTCP00"
	 *
	 * NOTA: Mirar el formato del fichero a cargar en el fichero "leiame.txt" (está en este proyecto en src/main/resources)
	 * 
	 * NOTA 2: Este procedimiento, sólo inserta nuevos registros, sin borrar los ya existentes en la tabla "PFNET_ADM.TPTCP00"
	 */
	@SuppressWarnings("resource")
    private void launchJob(){
        
		logger.info("Cargamos el contexto de Spring");
		// Cargamos el contexto de Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");
        
        logger.info("Creamos una entidad de JobLauncher, desde el bean del contexto");
        // Creamos una entidad de JobLauncher, desde el bean del contexto
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        
        logger.info("Creamos una entidad de Job, desde el bean del contexto");
        // Creamos una entidad de Job, desde el bean del contexto
        Job job = (Job) context.getBean("cpsPTResultJob");
      
        try {
        	logger.info("Ejecutamos el Job cpsPTResultJob");
        	// Ejecutamos el Job 
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            logger.info("Job Exit Status : "+ execution.getStatus());
      
        } catch (JobExecutionException e) {
            logger.info("Job cpsPTResultJob failed");
            e.printStackTrace();
            logger.info("Al fallar el Job ya no está en ejecución");
            enEjecucion = false;
        }
    }
	
	public void launch() {
		
		logger.info("Comprobamos si se está ejecutando el Job");
		
		if (!enEjecucion) {
			
			logger.info("Marcamos que se está ejecutando el Job");
			enEjecucion = true;
			
			this.launchJob();
			
			logger.info("Ejecutamos el Job"); 
        	this.launchJob();
            
        	logger.info("Al terminar marcamos que el Job ya no está en ejecución");
            enEjecucion = false;
			
		} else {
			
			logger.info("Ya se está ejecutando la carga de los CP de Portugal, se está actualizando la tabla PFNET_ADM.TPTCP00");
		}
		
	}
}
