package homework2;

public class DoubleLoop {

	public static void main(String[] args) {
		System.out.println("Printing multiplication table start");
		for(int i = 1; i<=20; i++){
			for(int j=0; j<=10; j++){
			System.out.println(i+ "*"+ j+ "="+ i*j);
			}
			System.out.println("Multiplication table of "+ i+ " completed");
		}

	}
}