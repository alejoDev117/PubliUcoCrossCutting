package co.edu.uco.crosscutting.utils;

public final class UtilText {
	
	private static final UtilText INSTANCE  = new UtilText();
	public static final String EMPTY = "";

	
	private UtilText() {
		super();
	}
	
	
	public static UtilText getUtilText() {
		return INSTANCE;
		
	}
	
	public boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}
	
	public final String getDefault(final  String text, String defaultValue) {
		
		String result = text;
		
		if(isNull(text)) {
			result = isNull(defaultValue) ? EMPTY : defaultValue;
		}
		
		return result;
	}
	
	public final String applyTrim(final  String text) {
		return getDefault(text).trim();
	}
		
		
	public final String getDefault(final  String text) {
		return (getDefault(text,EMPTY)); //Operador ternario
	}
	
	public final boolean isEmpty(final String text) {
		return applyTrim(text).equals(EMPTY);
	}
	
	public final String getDefaultEmpty(final String text, final String defaultValue) {
		return isEmpty(text) ? getDefault(defaultValue) : text;
	}
	
	public final String getDefaultValue() {
		return EMPTY;
	}
	
	public final boolean matchPattern(final String text, final String pattern) {
		return getDefault(text).matches(getDefault(pattern));
	}
	
}
