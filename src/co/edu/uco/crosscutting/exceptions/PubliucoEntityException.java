package co.edu.uco.crosscutting.exceptions;

public final class PubliucoEntityException extends PubliucoException{

	private static final long serialVersionUID = -3026108038378317945L;

	private PubliucoEntityException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
		
	}
	
	
	public static final PubliucoEntityException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoEntityException(technicalMessage, userMessage, rootCause);
	}
	
	public static final PubliucoEntityException create( final String userMessage) {
		return new PubliucoEntityException(userMessage, userMessage, new Exception());
	}
	
	public static final PubliucoEntityException create(final String technicalMessage, final String userMessage) {
		return new PubliucoEntityException(technicalMessage, userMessage, new Exception());
	}
	
	
}
