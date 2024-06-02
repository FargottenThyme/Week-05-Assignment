package weekFiveCodingProject;

public class AsteriskLogger implements Logger{
	
	private String log;
	private String error = "ERROR: ";
	
	public String getLog() {
		return log;
	}
	
	public void setLog(String log) {
		this.log = log;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		String astBox = "*";
		astBox = astBox.repeat(error.length()+6);
		String err = astBox + "\n***" + error + "***\n" + astBox;
		System.out.println(err);	
	}
	
	

}
