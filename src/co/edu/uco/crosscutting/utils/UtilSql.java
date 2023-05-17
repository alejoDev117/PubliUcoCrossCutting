package co.edu.uco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectcCrossCuttingException;
import co.edu.uco.compuconnect.crosscutting.utils.Messages.UtilSqlMessage;
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
	
	public static void closeConnection(final Connection connection) {
		try {
		if(!connectionIsOpen(connection)) {	
			connection.close();
		}
			}catch(PubliucoCrossCuttingException exception) {
				
				throw exception;
				
			} catch (final SQLException exception) {
				
				throw PubliucoCrossCuttingException.create(UtilsqlMessages.CONNECTION_IS_CLOSE_TECHNICAL_SQL_EXCEPTION,UtilsqlMessages.CONNECTION_IS_CLOSE_USER_MESSAGE);
				
			} catch (final Exception exception) {
				
				throw PubliucoCrossCuttingException.create(UtilsqlMessages.CONNECTION_IS_CLOSE_TECHNICAL_EXCEPTION,UtilsqlMessages.CONNECTION_IS_CLOSE_USER_MESSAGE);
				
			} 
	
		}
}
