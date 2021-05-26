import java.io.File;
import java.util.Scanner;

public class Assignment1 {

	public static void Go(Scanner scanner) {
		
		scanner.nextLine(); //read newline after "1"
		
		System.out.println("Enter the directory name.");
		
		String path = scanner.nextLine();
		
		File directory = new File(path);
		
		for (String entry : directory.list()) {
			System.out.println(entry);
		}
	}
}
