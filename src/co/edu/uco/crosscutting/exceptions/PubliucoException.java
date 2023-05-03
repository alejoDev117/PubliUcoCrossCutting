package co.edu.uco.crosscutting.exceptions;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;

public class PubliucoException extends RuntimeException {

	
	private static final long serialVersionUID = 8360697237896637789L;
	private ExceptionType type;
	private String userMessage;
	
	
	
	protected PubliucoException(String technicalMessage, String userMessage, Throwable rootCause, ExceptionType type) {
		super(technicalMessage,rootCause);
		setUserMessage(userMessage);
		setType(type);
		
	}

	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultEmpty(getMessage(), getUserMessage());
	}
	
	
	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(), new Exception());
	}


	public final ExceptionType getType() {
		return type;
	}



	private final void setType(final ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}



	public final String getUserMessage() {
		return userMessage;
	}



	private  final void setUserMessage(final String userMessage) {
		this.userMessage = UtilText.getUtilText().getDefault(userMessage);
	}
	
	
	
}
