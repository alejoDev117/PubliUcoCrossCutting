package co.edu.uco.crosscutting.utils;

public final class UtilBoolean {
	
	private static final boolean DEFAULT_VALUE = false;
	
	
	
	private UtilBoolean() {
		super();
	}
	
	
	public static final boolean getDefaultValue() {
		return DEFAULT_VALUE;
	}
	
	
	public static final boolean getDefault(boolean booleanValue) {
		return UtilObject.isNull(booleanValue) ? DEFAULT_VALUE : booleanValue;
	}
	
	

}
