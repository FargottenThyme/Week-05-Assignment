package weekFiveCodingProject;

public class App {

	public static void main(String[] args) {
		String test = "Test";
		Logger astLog = new AsteriskLogger();
		Logger spcLog = new SpacedLogger();
		astLog.log(test);
		System.out.println();
		astLog.error(test);
		System.out.println();
		spcLog.log(test);
		System.out.println();
		spcLog.error(test);
	}

}
