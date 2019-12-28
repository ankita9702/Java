package ankita;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regNo=117;
		int sub1=60;
		int sub2=35;
		int sub3=98; 
		int pass;
		int total=sub1+sub2+sub3;
		double average=total/3;
		if(sub1<40){
			pass=0;
		}
		else if (sub2<40){
			pass=0;
		}
		else if (sub3<40){
			pass=0;
		}
		else{
			pass=1;
		}
		if(pass==1){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
	}
}
