package ankita;

public class DaysInMonth {

	public static void main(String[] args) {
		switch (args[0]){
			case "Feburary":
				System.out.println("28/29");
				break;
			case "April":
			case "June":
			case "September":
			case "November":
				System.out.println("30");
				break;
			default:
				System.out.println("31");
		}
	}

}
