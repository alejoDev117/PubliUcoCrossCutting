package co.edu.uco.crosscutting.exceptions;

public final class PubliucoDTOException extends PubliucoException{

	private static final long serialVersionUID = -3026108038378317945L;

	private PubliucoDTOException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
		
	}
	
	
	public static final PubliucoDTOException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoDTOException(technicalMessage, userMessage, rootCause);
	}
	
	public static final PubliucoDTOException create( final String userMessage) {
		return new PubliucoDTOException(userMessage, userMessage, new Exception());
	}
	
	public static final PubliucoDTOException create(final String technicalMessage, final String userMessage) {
		return new PubliucoDTOException(technicalMessage, userMessage, new Exception());
	}
	
	
}
