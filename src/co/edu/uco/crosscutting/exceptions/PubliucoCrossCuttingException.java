package co.edu.uco.crosscutting.exceptions;

public final class PubliucoCrossCuttingException extends PubliucoException{

	private static final long serialVersionUID = -3026108038378317945L;

	private PubliucoCrossCuttingException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
		
	}
	
	
	public static final PubliucoCrossCuttingException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoCrossCuttingException(technicalMessage, userMessage, rootCause);
	}
	
	public static final PubliucoCrossCuttingException create( final String userMessage) {
		return new PubliucoCrossCuttingException(userMessage, userMessage, new Exception());
	}
	
	public static final PubliucoCrossCuttingException create(final String technicalMessage, final String userMessage) {
		return new PubliucoCrossCuttingException(technicalMessage, userMessage, new Exception());
	}
	
	
}
