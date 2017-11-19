import java.util.Scanner;
public class EndOther {
	public static void main(String[] args) {
	//2. Given two strings, return true if either of the strings appears at the very end
	//of the other string, ignoring upper/lower case differences 
	//(in other words, the computation should not be "case sensitive").  
    //+endOther("Hiabc", "abc") → true 
	//+endOther("AbC", "HiaBc") → true 
    //+endOther("abc", "abXabc") → true
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str= console.next().toLowerCase();
		int size = str.length();
		System.out.println(str.substring(size-3, size).contains("abc"));
	}
}
