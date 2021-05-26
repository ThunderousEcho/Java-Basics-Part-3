import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {

	public static void Go(Scanner scanner) {
		
		scanner.nextLine(); //read newline after "2"
		
		System.out.println("Enter the filename.");
		
		String filename = scanner.nextLine();
		
		try {
			
			FileWriter fileWriter = new FileWriter(filename, true);
			
			fileWriter.write("some text\n");
			fileWriter.close();
			
			System.out.println("Done.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
