package ankita;

public class TypeCasting {

	public static void main(String[] args) {
		byte b = 50;
		short s1 = b; //implicit typecasting
		System.out.println(s1);
		int x =32000;
		short s2 = (short) x;
		System.out.println(s2);
	}
}
