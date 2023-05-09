package co.edu.uco.crosscutting.utils;

public final class UtilMail {

	private static final String DEFAULT_VALUE_MAIL ="null.1234@uco.net.co";
	private static final String FORMAT_MAIL = "";
	
	
	
	
	
	
	public static final String getDefault(String mailValue) {
		return UtilObject.isNull(mailValue) ? DEFAULT_VALUE_MAIL : mailValue;
	}


	public static final String applyTrimMail(String mailValue) {
		return getDefault(mailValue.trim());
	}

	public static final String getDefaultValueMail() {
		return DEFAULT_VALUE_MAIL;
	}






	
	
	
}
