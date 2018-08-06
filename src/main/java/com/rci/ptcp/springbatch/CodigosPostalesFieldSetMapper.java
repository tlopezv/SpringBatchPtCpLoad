package com.rci.ptcp.springbatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import com.rci.ptcp.springbatch.model.CodigosPostales;

public class CodigosPostalesFieldSetMapper implements FieldSetMapper<CodigosPostales> {

	@Override
	public CodigosPostales mapFieldSet(FieldSet fieldSet) throws BindException {
		// Mapper to map the File fields to Entity Class
		// Para hacer la correspondencia del campo devuelto por el Reader, debemos pasarlo a un objeto de nuestro Model
		CodigosPostales result = new CodigosPostales();
		
		// En la posición 0 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "DD" (Código de Distrito)
		result.setDd(fieldSet.readInt(0));
		// En la posición 1 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "CC" (Código del Municipio)
		result.setCc(fieldSet.readInt(1));
		// En la posición 2 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "LLLL" (Código de Localidad)
		result.setLlll(fieldSet.readLong(2));
		// En la posición 3 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "LOCALIDAD" (Nombre de la Localidad)
		result.setLocalidade((fieldSet.readString(3).length() > 70)? fieldSet.readString(3).substring(0, 70) :fieldSet.readString(3));
		// En la posición 4 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "ART_COD" (Código de la Arteria)
		result.setArt_cod((fieldSet.readString(4).length() > 40)? fieldSet.readString(4).substring(0, 40) : fieldSet.readString(4));
		// En la posición 5 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "ART_TIPO" (Tipo de Arteria - calle, plaza, ...)
		result.setArt_tipo((fieldSet.readRawString(5).length() > 40)? fieldSet.readString(5).substring(0, 40) : fieldSet.readString(5));
		// En la posición 6 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "PRI_PREP" (Primera Preposición)
		result.setPri_prep((fieldSet.readString(6).length() > 10)? fieldSet.readString(6).substring(0, 10) : fieldSet.readString(6));
		// En la posición 7 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "ART_TITULO" (Título de Arteria - Doctor, Ing., Profesor,... )
		result.setArt_titulo((fieldSet.readString(7).length() > 70)? fieldSet.readString(7).substring(0, 70) : fieldSet.readString(7));
		// En la posición 8 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "SEG_PREP" (Segunda Preposición)
		result.setSeg_prep((fieldSet.readString(8).length() > 10)? fieldSet.readString(8).substring(0, 10) : fieldSet.readString(8));
		// En la posición 9 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "ART_DESIG" (Designación de la Arteria)
		result.setArt_desig((fieldSet.readString(9).length() > 70)? fieldSet.readString(9).substring(0, 70) : fieldSet.readString(9));
		// En la posición 10 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "ART_LOCAL" (Información del Lugar o Zona)
		result.setArt_local((fieldSet.readString(10).length() > 70)? fieldSet.readString(10).substring(0, 70) : fieldSet.readString(10));
		// En la posición 11 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "TRAMO"
		result.setTramo((fieldSet.readString(11).length() > 70)? fieldSet.readString(11).substring(0, 70) : fieldSet.readString(11));
		// En la posición 12 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "PUERTA"
		result.setPuerta((fieldSet.readString(12).length() > 70)? fieldSet.readString(12).substring(0, 70) : fieldSet.readString(12));
		// En la posición 13 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "CLIENTE" (Nombre del Cliente)
		result.setCliente((fieldSet.readString(13).length() > 40) ? fieldSet.readString(13).substring(0, 40) : fieldSet.readString(13));
		// En la posición 14 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "CP4" (Nº de Código Postal)
		result.setCp4(fieldSet.readLong(14));
		// En la posición 15 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "CP3" (Extensión del nº de código postal)
		result.setCp3(fieldSet.readLong(15));
		// En la posición 16 de cada fila del fichero de códigos postales "todos_cp.txt" esta el campo "CPALF" (Designación Postal)
		result.setCpalf((fieldSet.readString(16).length() > 70)? fieldSet.readString(16).substring(0, 70) : fieldSet.readString(16));
		
		return result;
	}

}
