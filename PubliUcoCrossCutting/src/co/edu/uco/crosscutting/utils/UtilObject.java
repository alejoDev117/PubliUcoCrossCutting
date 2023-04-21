package co.edu.uco.crosscutting.utils;

public interface UtilObject {
		
	
	 static <O> boolean isNull(final O object) {
		return (object == null);
	}

}
