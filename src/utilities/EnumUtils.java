package utilities;

public class EnumUtils {
	/**
	 * @param <T> Generic Enumerator Object
	 * @param input Input string received from Scanner for Enum value
	 * @param enumClass The Enum Class whose values are being checked
	 * @return Boolean value to indicate if the input value is a correct one.
	 */
	public static <T extends Enum<T>> boolean validateStringInput
	(String input, Class<T> enumClass){
		boolean result = false;
		for(Enum<T> choice : enumClass.getEnumConstants()) {
			if(input.equals(choice.name())) {
				result = true;
				break;
			} else {
				result = false;		
			}
		}
		return result;
	}
	
	/**
	 * @param <T> Generic Enumerator Object
	 * @param n number of times the method should loop for correct input
	 * @param enumInput string value of enum received from scanner
	 * @param enumClass enum class whose values should be checked
	 * @return a boolean flag if the input matches the enum values
	 */
	
	public static <T extends Enum<T>> boolean enumInputNTimeCheck(int n, 
			String enumInput, Class<T> enumClass) {
		boolean validInput = false;
		for(int i = 0; i <=n; i++) {
			if(validateStringInput(enumInput, enumClass)) {
				validInput = true;
				break;
			}
		}
		return validInput;
	}

}
