package codingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger AstriskLogger = new AstriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		AstriskLogger.Log("Hello");
		System.out.println("\n");
		AstriskLogger.Error("Hello");
		System.out.println("\n");
		
		SpacedLogger.Log("Hello");
		System.out.println("\n");
		SpacedLogger.Error("Hello");
		
	}

}
