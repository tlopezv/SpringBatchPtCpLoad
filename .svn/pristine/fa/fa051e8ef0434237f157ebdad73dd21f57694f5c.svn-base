package com.rci.ptcp.springbatch.SpringBatchPtCpLoad;

import org.apache.log4j.Logger;

public class AppThread extends Thread {
	
	private static boolean enEjecucion = false;
	
	private String mensaje = null;
	
	private static Logger logger = Logger.getLogger(AppThread.class.getName());
	
	
//	public void run() {
//		// Para una explicación de hilos mirar http://www.chuidiang.org/java/hilos/hilos_java.php
//		
//		logger.info("Comprobamos si hay algún hilo en ejecución");
//		
//		// Comprobamos si hay algún hilo en ejecución
//		if (!enEjecucion) {
//			
//			logger.info("Se marca este hilo como en ejecución");
//			enEjecucion = true;
//	      
//	        try {
//	        	
//	        	logger.info("Ejecutamos el Job");
//	        	// Ejecutamos el Job 
//	        	App.getSingletonInstance().launch();
//	            
//	            // Al terminar marcamos que dicho hilo ya no está en ejecución.
//	            enEjecucion = false;
//	      
//	        } catch (Exception e) {
//	            logger.info("Job cpsPTResultJob failed");
//	            e.printStackTrace();
//	         // Al fallar marcamos que dicho hilo ya no está en ejecución.
//	            enEjecucion = false;
//	        }
//			
//		} else {
//			// Indicamos que ya hay un hilo en ejecución
//			mensaje="Ya se está ejecutando la carga de los CP de Portugal, se está actualizando la tabla PFNET_ADM.TPTCP00";
//			logger.info(mensaje);
//		}
//
//	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public boolean getEnEjecucion() {
		return enEjecucion;
	}

}
