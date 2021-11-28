package codingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		System.out.println(str.replace("", " ").trim());
		
	}

	@Override
	public void Error(String str) {
		String newStr = str.replace("", " ");
		
		System.out.println("ERROR: " + newStr);
	}

}
