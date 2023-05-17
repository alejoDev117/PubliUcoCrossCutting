package co.edu.uco.crosscutting.utils;

import java.util.UUID;

public final class UtilUUID {
	
	private static final String DEFAULT_UUID_AS_STRING = "ffffffff-ffff-ffff-ffff-ffffffffffff";
	private static final UUID DEFAULT_UUID = generateUUIDFromString(DEFAULT_UUID_AS_STRING); 
	private static final String UUID_RE = "[a-f0-9]{8}([-][a-f0-9]{4}){3}[-][a-f0-9]{12}"; 
	
	private UtilUUID() {
		super();
	}
	
	public static final UUID generateNewUUID() {
		return UUID.randomUUID();
	}
	
	public static final boolean uuidAsStringIsValid(final String uuidValue) {
		return UtilText.getUtilText().matchPattern(uuidValue, UUID_RE);
	}
	
	
	public static final UUID generateUUIDFromString(final String uuidValue) {
		return uuidAsStringIsValid(uuidValue) ? UUID.fromString(uuidValue) : DEFAULT_UUID;
	}
	


	public static final String getDefaultUuidAsString() {
		return DEFAULT_UUID_AS_STRING;
	}

	public static final UUID getDefaultUuid() {
		return DEFAULT_UUID;
	}
	
	public static final UUID getDefault(final UUID uuidValue) {
		return UtilObject.isNull(uuidValue) ? DEFAULT_UUID : uuidValue;
	}
	
	
	public static final boolean isDefault(final UUID uuidValue) {
		return DEFAULT_UUID.equals(getDefault(uuidValue));
	}
}
