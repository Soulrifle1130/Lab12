
public class Lab12Prob02 {

//	public static String reverseString(String n) {
//		String output = "";
//		int origLength = n.length();
//		if (n.length() == 1) {
//			return n;
//		} else if (n.length() != origLength) {
//			output += reverseString(n.substring(n.length() - 2, n.length() - 1));
//		} else {
//			return output;
//		}
//	}
	
	public static String reverseString(String n) {
		if (n.length() == 1) {
			return n;
		} else {
			return reverseString(n.substring(n.length() - 1, n.length()) + n.substring(0, n.length() - 1));
			}
		}
	
//	public static void main(String[] args) {
//		System.out.println(reverseString("andrew"));
//	}
}
	