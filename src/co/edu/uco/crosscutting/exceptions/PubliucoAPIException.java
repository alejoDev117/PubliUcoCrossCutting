package co.edu.uco.crosscutting.exceptions;

public final class PubliucoAPIException extends PubliucoException{

	private static final long serialVersionUID = -3026108038378317945L;

	private PubliucoAPIException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
		
	}
	
	
	public static final PubliucoAPIException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoAPIException(technicalMessage, userMessage, rootCause);
	}
	
	public static final PubliucoAPIException create( final String userMessage) {
		return new PubliucoAPIException(userMessage, userMessage, new Exception());
	}
	
	public static final PubliucoAPIException create(final String technicalMessage, final String userMessage) {
		return new PubliucoAPIException(technicalMessage, userMessage, new Exception());
	}
	
	
}
