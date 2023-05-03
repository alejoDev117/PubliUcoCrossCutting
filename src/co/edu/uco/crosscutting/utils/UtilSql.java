package co.edu.uco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.crosscutting.exceptions.PubliucoCrossCuttingException;
import co.edu.uco.crosscutting.utils.Messages.UtilsqlMessages;

public final class UtilSql {

	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection)  {
		if(UtilObject.isNull(connection)) {
			
			
		}
		
		try {
			return !connection.isClosed();
		} catch (final SQLException e) {
			var userMessage = UtilsqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage);
		}
           catch (final Exception e) {
		var userMessage = UtilsqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
		var technicalMessage = UtilsqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
		throw PubliucoCrossCuttingException.create(technicalMessage, userMessage);
	}
	}
}
