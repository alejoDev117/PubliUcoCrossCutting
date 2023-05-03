package co.edu.uco.crosscutting.exceptions;

public final class PubliucoBusinessException extends PubliucoException{

	private static final long serialVersionUID = -3026108038378317945L;

	private PubliucoBusinessException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSINESS);
		
	}
	
	
	public static final PubliucoBusinessException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoBusinessException(technicalMessage, userMessage, rootCause);
	}
	
	public static final PubliucoBusinessException create( final String userMessage) {
		return new PubliucoBusinessException(userMessage, userMessage, new Exception());
	}
	
	public static final PubliucoBusinessException create(final String technicalMessage, final String userMessage) {
		return new PubliucoBusinessException(technicalMessage, userMessage, new Exception());
	}
	
	
}
