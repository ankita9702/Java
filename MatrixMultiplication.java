package ankita;

public class MatrixMultiplication {

public static void main(String[] args) {
	int x[][] = new int[3][3];
	int y[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int product[][] = new int[3][3];
	for (int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			x[i][j]=i+j;
		}
	}
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			for (int k=0; k<3; k++){
				product[i][j] += x[i][k]*y[k][j];
			}
		}
	}
	for (int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print(product[i][j]+ " ");
		}
		System.out.println();
	}
}
}
