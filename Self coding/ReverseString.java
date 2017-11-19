
import java.util.Scanner;
public class ReverseString {
		public static void main(String[] args) {
		//reverseString(“Hello there”) > “ereht olleH”
			Scanner console = new Scanner(System.in);
			System.out.println("Enter a string:");
			String str= console.nextLine();
			int size = str.length(); 
			System.out.println(size);
			for (int i=size-1; i>=0; i--) {
				System.out.print(str.charAt(i));
			}
		}
	}
