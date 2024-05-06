package cucmbervikashmarch;

public class Starprogram {

	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub


		int n = 9;
		for(int i =0; i<9; i++) {

			for(int j=0; j<n; j++) {

				System.out.print("* ");

			}	

			System.out.println(" ");

			
			int starsape = i*2;

			for(int j=0; j<=starsape; j++) {

				System.out.print(" ");

			}
			
			n= n-2;
		}
	}

}
