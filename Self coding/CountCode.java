import java.util.Scanner;
public class CountCode {
	public static void main(String[] args) {
	// 1. Return the number of times that the string "code" appears anywhere in the given string,
	// except we'll accept any letter for the 'd', so "cope" and "cooe" count.
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str= console.next().toLowerCase();
		int size = str.length();
		int count = 0;
		for (int i = 0; i<size; i++) {
			if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e') {
					count++;
			}
		}
		System.out.println(count);
	}
}


