package ExerciciosJava;

public class ex01 {
	
	public static void main (String [] args) {
		int total = 0;
		
		for (int i = 0; i < 500; i = i+3) {
			if ( i % 2 == 1) {
				
				System.out.println(i);
				total = total + i;
			}
		}
		System.out.println("O total é : " + total );
	}
	
}
