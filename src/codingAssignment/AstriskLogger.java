package codingAssignment;

public class AstriskLogger implements Logger {

	@Override
	public void Log(String str) {
		System.out.println("***" + str +"***");
		
	}

	@Override
	public void Error(String str) {
		String errorCode = "Error: " + str;
		int length = errorCode.length() + 6;
		String ask = "*";
		
		
		System.out.println(ask.repeat(length));
		System.out.println("***" + "Error: " + str +"***");
		System.out.println(ask.repeat(length));
		
	}

}
