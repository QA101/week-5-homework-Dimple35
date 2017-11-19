import java.util.Scanner;
public class FirstHalf {
		public static void main(String[] args) {
		//3. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 

			Scanner console = new Scanner(System.in);
			System.out.println("Enter a string that contains even numbers of chars:");
			String str= console.next();
			int size = str.length();
			if (size %2 == 0) {
				System.out.println(str.substring(0, size/2));
			}
		}
	}

