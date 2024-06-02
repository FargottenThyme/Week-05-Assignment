package weekFiveCodingProject;

public class SpacedLogger implements Logger{
	
	private static String spacedLog = "";
	private static String spacedError = "ERROR: ";

	@Override
	public void log(String log) {
		char[] spacedLogChars = log.toCharArray();
		for (char c : spacedLogChars) {
			spacedLog += String.valueOf(c) + " ";
		}
		System.out.println(spacedLog);
		
	}

	@Override
	public void error(String error) {
		char[] spacedErrorChars = error.toCharArray();
		for (char c : spacedErrorChars) {
			spacedError += String.valueOf(c) + " ";
		}
		System.out.println(spacedError);
		
	}

}
