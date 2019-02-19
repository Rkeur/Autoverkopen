import java.util.Random;
import java.util.Scanner;


public class Ganzenbord_easy {
	public static void main (String args[]) {
		System.out.println("Welkom bij het spel ganzenbord, klik op g om het spel te starten.");
		int plaats = 0;
		Scanner input = new Scanner (System.in);
		String ingegevene = input.nextLine();
		while(ingegevene.equals("g")) {
			
		System.out.println("Gooien van de dobbelsteen");
			Random dobbelsteen = new Random();
			int gegooid = dobbelsteen.nextInt(6) + 1;
			
			plaats += gegooid;
			System.out.println("Plaats is " + plaats);
			if (plaats == 25 || plaats == 45) {
				System.out.println("ga terug naar start");
				plaats = 0;
				
			
		}else if (63 <= plaats) {
			System.out.println ("Je hebt gewonnen!");
			break;
			
		}
			String ingegevene2 = input.nextLine();
			while(ingegevene2.equals("g")== false) {
			}
			
				switch (plaats) {
			case 23: 
				System.out.println("Het spel is over");
				plaats = plaats - 25;
				break;
				
			case 25:
				System.out.println("Ga terug naar start");
				plaats = plaats - 25;
			
			case 45:
				System.out.println("Ga terug naar start");
				plaats = plaats - 45;
				
				
			case 10: case 20: case 30: case 40: case 50: case 60:
				System.out.println("je staat op " + plaats + ", daarom loop je het geworpen aantal nog een keer");
				plaats = plaats + gegooid;
				System.out.println("Plaats is " + plaats);
				String ingegevene4 = input.nextLine();
				while(ingegevene4.equals("g")== false) {
				
				break;
				}
			default:
				System.out.println("");
				break;
				
			}
			
}
}
}
