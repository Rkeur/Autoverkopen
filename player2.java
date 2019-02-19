import java.util.Random;
import java.util.Scanner;
public class player2 {
	public static void main (String args[]) {
		System.out.println("Welkom bij het spel ganzenbord");
		int plaats = 0;
		
System.out.println("Druk op g om het spel te starten");

		Scanner input = new Scanner (System.in);
		
		String ingegevene = input.nextLine();
		while(ingegevene.equals("g")) {
			
		System.out.println("Gooien van de dobbelsteen");
			Random dobbelsteen = new Random();
			plaats += dobbelsteen.nextInt(6) + 1;
			System.out.println("plaats is " + plaats);
			if (plaats == 25 || plaats == 45) {
				System.out.println("opnieuw beginnen");
				plaats = 0;
			
		}else if (plaats > 63) {
				plaats = 63 - (plaats - 63);
				System.out.println("Dit is te ver, ga daarom terug naar " + plaats);
			
			}else if (63 == plaats) {
			System.out.println ("Je hebt gewonnen!");
			break;
			
		}String ingegevene2 = input.nextLine();
			while(ingegevene2.equals("g")== false) {
			}
			switch (plaats) {
			case 25: 
				System.out.println("Ga terug naar start");
				plaats = plaats - 25;
				break;
				
			case 45:
				System.out.println("Ga terug naar start");
				plaats = plaats - 45;
				break;
				
			case 10: case 20: case 30: case 40: case 50: case 60:
				System.out.println("Je hebt een extra beurt, gooi nog een keer");
				String ingegevene3 = input.nextLine();
				while(ingegevene3.equals("g")== false) {
				}
				System.out.println(plaats += dobbelsteen.nextInt(6) + 1);
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


