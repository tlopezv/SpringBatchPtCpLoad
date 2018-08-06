package com.rci.ptcp.springbatch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.rci.ptcp.springbatch.dao.CodigosPostalesDAO;
import com.rci.ptcp.springbatch.model.CodigosPostales;

public class CodigosPostalesItemProcessor implements ItemProcessor<CodigosPostales, CodigosPostales> {

	private static Logger logger = Logger.getLogger(CodigosPostalesItemProcessor.class.getName());
	
	private static Map<String,String> codsVia;
	
	@Autowired
	CodigosPostalesDAO cpsDAO;

	public CodigosPostalesItemProcessor() {
		super();
		this.initCodsViaMap();
	}

	/**
	 * initCodsViaMap - 
	 * 
	 * Rellena el Map con los Códigos de la vía. 
	 * Correspondiendo Código con el Tipo de Arteria (Calle, Plaza, ...) del registro  
	 */
	private void initCodsViaMap() {
		
		if (codsVia == null) {
			
			codsVia = new HashMap<String,String>();
			codsVia.put("ALAMEDA","00000001");
			codsVia.put("AVENIDA","00000002");
			codsVia.put("AZINHAGA","00000003");
			codsVia.put("BECO","00000004");
			codsVia.put("BAIRRO","00000005");
			codsVia.put("ESCANDINHAS","00000006");
			codsVia.put("CALÇADA","00000007");
			codsVia.put("8","00000008");
			codsVia.put("CALÇADINHA","00000009");
			codsVia.put("ENTRADA","00000010");
			codsVia.put("CAMINHO","00000011");
			codsVia.put("CASAL","00000012");
			codsVia.put("JARDIM","00000013");
			codsVia.put("LARGO","00000014");
			codsVia.put("LOTEAMENTO","00000015");
			codsVia.put("PARQUE","00000016");
			codsVia.put("PÁTIO","00000017");
			codsVia.put("PLACETA","00000018");
			codsVia.put("PROLONGAMENTO","00000019");
			codsVia.put("PRAÇA","00000020");
			codsVia.put("TRAVESSA","00000021");
			codsVia.put("URBANIZAÇÃO","00000022");
			codsVia.put("QUINTA","00000023");
			codsVia.put("RUA","00000024");
			codsVia.put("TRANSVERSAL","00000025");
			codsVia.put("VILA","00000026");
			codsVia.put("ROTUNDA","00000027");
			codsVia.put("ZONA","00000028");
		}
			
	}

	@Override
	public CodigosPostales process(CodigosPostales result) throws Exception {

		// El processor se ejecuta después de cada lectura de un item por el ItemReader
		// Y antes de que se ejecute el ItemWriter, al cuál este procesor le devuelve lo
		// que escribirá
		logger.debug("Processing result :" + result);

		// Vamos a ver si el item leído ya está como registro en nuestra tabla
		// PFNET_ADM.TPTCP00
		if (this.repeatItem(result)) {
			// De estar no lo metemos de nuevo
			logger.debug("Processing skip this item :" + result +" Because it exist's in the DB Table");
			return null;
		}

		result = this.formatItem(result);
		// Si no está el item leído lo pasamos al ItemWriter para que lo inserte en
		// nuestra tabla PFNET_ADM.TPTCP00
		logger.debug("Processing admit this item :" + result +" Because it doesn't exist in the DB Table");
		return result;
	}

	private boolean repeatItem(CodigosPostales item) {
		boolean result = false;
		
		List<CodigosPostales> cps = cpsDAO.findRecords(item);
		
		if (cps.size() > 0) {
		
			for(CodigosPostales record: cps) {
				if (record.equals(item)) {
					result = true;
					break;
				}
			}
		}
		
		return result;
	}

	/**
	 * formatItem - 
	 * 
	 * Rellenamos el resto de campos de nuestro Objeto modelo, para no dejar campos a NULL
	 * 
	 * @param result Clase correspondiente con nuestro modelo de Datos
	 * 
	 * @return CodigosPostales con resto de campo rellenos
	 */
	private CodigosPostales formatItem(CodigosPostales result) {
		
		// Rellenamos el resto de campos de nuestro Objeto modelo, para no dejar campos a NULL
		// Identificación de Provincia Portugal Abaco
		result.setId_pro(this.getIdPtProvince(result.getCp4()));
		// Nombre de la vía fusionada
		result.setNom_via(result.getArt_titulo()+" "+result.getSeg_prep()+" "+result.getArt_desig());
		// Código de la vía
		result.setCod_via(codsVia.get(result.getArt_tipo().toUpperCase().trim()));
		// Número de par mínimo
		result.setNumparmin("0002");
		// Número de par máximo
		result.setNumparmax("9998");
		// Número de impar mínimo
		result.setNumimparmin("0001");
		// Número de impar máximo
		result.setNumimparmax("9999");
		
		return result;
	}

	/**
	 * getIdPtProvince
	 * 
	 * Lógica para obtener el Identificador de Provincia de Portugal para Abaco
	 * 
	 * @param cp4 Código Postal
	 * 
	 * @return Identificador de Provincia de Portugal par Abaco
	 */
	private int getIdPtProvince(long cp4) {
		int result = 80;
		
		if (cp4 >= 9500L) {
			result = 82;
		} else if (cp4 >= 9000L) {
			result = 81;
		}
		
		return result;
	}

	public CodigosPostalesDAO getCpsDAO() {
		return cpsDAO;
	}

	public void setCpsDAO(CodigosPostalesDAO cpsDAO) {
		this.cpsDAO = cpsDAO;
	}
	
	

}
