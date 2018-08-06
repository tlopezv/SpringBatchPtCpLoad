package com.rci.ptcp.springbatch;


import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.batch.item.file.FlatFileParseException;

import com.rci.ptcp.springbatch.model.CodigosPostales;

public class CustomSkipListener implements SkipListener<CodigosPostales, CodigosPostales> {

	private static Logger logger = Logger.getLogger(CustomSkipListener.class.getName());

	@Override
	public void onSkipInProcess(CodigosPostales item, Throwable t) {
		StringBuilder message = new StringBuilder("ERROR en PROCESADO: ").append(t.getMessage());

		message.append("\n\tEn el item: " + item);

		logger.info(message.toString());
		logger.warn(message.toString());
	}

	@Override
	public void onSkipInRead(Throwable t) {
		StringBuilder message = new StringBuilder("ERROR en LECTURA: ");

		if (t instanceof FlatFileParseException) {
			message.append("Line ").append(((FlatFileParseException) t).getLineNumber())
					.append(": Error de formato para la siguiente entrada: ")
					.append(((FlatFileParseException) t).getInput());
		} else {
			message.append(t.getMessage());
		}

		logger.info(message.toString());
		logger.warn(message.toString());

	}

	@Override
	public void onSkipInWrite(CodigosPostales item, Throwable t) {
		StringBuilder message = new StringBuilder("ERROR en ESCRITURA: ").append(t.getMessage());

		message.append("\n\tEn el item: " + item);

		logger.info(message.toString());
		logger.warn(message.toString());

	}

}
