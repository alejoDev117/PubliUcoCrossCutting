package co.edu.uco.crosscutting.utils;

public final class UtilNumeric {
	
	
	private static final int DEFAULT_INT_VALUE = 0;
	private static final float DEFAULT_FLOAT_VALUE = 0.0f;
	
	private UtilNumeric() {
		super();
	}
	
	
	

	public static final int getDefaultIntValue() {
		return DEFAULT_INT_VALUE;
	}


	public static final float getDefaultFloatValue() {
		return DEFAULT_FLOAT_VALUE;
	}
	
	
	public static final int getDefaultValueInt(int intValue) {
		return UtilObject.isNull(intValue) ? DEFAULT_INT_VALUE : intValue; 
	}
	
	public static final float getDefaultValueFloat(float floatValue) {
		return UtilObject.isNull(floatValue) ? DEFAULT_FLOAT_VALUE : floatValue;
	}

}
