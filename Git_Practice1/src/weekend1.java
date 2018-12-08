
public class weekend1 {

	static String str1 = "qweqwe";
	public static boolean test(String str, CharSequence c) {
		for (int i = 0; i<str.length(); i++) {
			if (str.contains(c)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		
		System.out.println(str1.indexOf('q'));
		

	}
}
