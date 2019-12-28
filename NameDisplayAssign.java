package ankita;

public class NameDisplayAssign {
	public static void main(String[] args) {
		for(int i=0; i<args[0].length(); i++){
			System.out.println(args[0].charAt(i));
		}
		for(int i=0; i<=args[0].length(); i++){
			for(int j=0; j<i; j++){
				System.out.print(args[0].charAt(j));
			}
			System.out.println();
		}
	}
}
