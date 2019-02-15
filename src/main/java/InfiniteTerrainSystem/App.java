package InfiniteTerrainSystem;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	
			Compass treasure = new Compass (0, 0, 3, 1);
			Compass player = new Compass(0 ,0 ,0, 0);
			
		Scanner sc = new Scanner (System.in);
				String s = sc.nextLine();
				int i = sc.nextInt();
					
				
				if (player != treasure);{
				System.out.println("Which direction would you like to go? Hint: North");
		} else if(player != treasure) {
					System.out.println("Which direction would you like to go? Hint: North");
		} else if (treasure != player) {
			System.out.println("Which direction would you like to go? Hint: East");
		} else if (player == treasure) {
			System.out.println("You win");
}
}
}

