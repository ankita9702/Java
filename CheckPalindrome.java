package ankita;

public class CheckPalindrome {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append(args[0]);
		sb.reverse();
		String sbReverse = sb.toString();
		sb.reverse();
		String str = sb.toString();
		System.out.println(str.equalsIgnoreCase(sbReverse));
	}
}
