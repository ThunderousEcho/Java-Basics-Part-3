import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3 {

	public static void Go(Scanner scanner) {
		
		scanner.nextLine(); //read newline after "3"
		
		System.out.println("Enter the character to scan for.");
		
		char search = scanner.next().charAt(0);
		scanner.nextLine(); //read newline after the character
		
		System.out.println("Enter the filename to scan.");
		
		String filename = scanner.nextLine();
		
		try {
			
			int count = 0;
			
			FileReader fileReader = new FileReader(filename);
			
			while (true) {
				int read = fileReader.read();
				if (read == -1) { break; }
				else if (read == search) { count++; }
			}
			
			System.out.println("Counted " + count + " occurences.");
			
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
