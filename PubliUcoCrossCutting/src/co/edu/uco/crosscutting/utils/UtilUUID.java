package co.edu.uco.crosscutting.utils;

import java.util.UUID;

public final class UtilUUID {
	
	private static final String DEFAULT_UUID_AS_STRING = "FFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF";
	public static final UUID DEFAULT_UUID = generateUUIDFromString(DEFAULT_UUID_AS_STRING); 
	
	
	private UtilUUID() {
		super();
	}
	
	public static final UUID generateNewUUID() {
		return UUID.randomUUID();
	}
	
	public static final UUID generateUUIDFromString(final String uuidValue) {
		return UUID.fromString(uuidValue);
	}
	
	
	
}
