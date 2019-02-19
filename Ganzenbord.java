import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {
	public static void main (String args[]) {
	
		System.out.println("Welkom bij het spel ganzenbord");
		int player []= {1,2,3,4};
		int plaats[]= {0,0,0,0};
		System.out.println("Druk op g om het spel te starten");
		Scanner input = new Scanner (System.in);
		
		String ingegevene = input.nextLine();
		while(ingegevene.equals("g")) {
		
			for(int counter=0;counter<=3;counter++){
		int speler = counter;
		
		System.out.println("Gooien van de dobbelsteen");
			Random dobbelsteen = new Random();
			plaats[speler] += dobbelsteen.nextInt(6) + 1;
			System.out.println("Speler " + player[speler] + " gooit. Hij staat op plaats " + plaats[speler]);
			if (plaats[speler] == 58) {
				System.out.println("opnieuw beginnen");
				plaats[speler] = 0;
			
			}else if (plaats[speler] == 6) {
				plaats[speler] = 6 + 6;
				System.out.println("Je staat op de brug, ga verder naar plaats " + plaats[speler]);
			
			}else if (plaats[speler] == 42) {
				plaats[speler] = 42 - 3;
				System.out.println("Je bent verdwaald, ga terug naar plaats " + plaats[speler]);	
				
			}else if (plaats[speler] > 63) {
				plaats[speler] = 63 - (plaats[speler] - 63);
				System.out.println("Dit is te ver, ga daarom terug naar " + plaats[speler]);
			
			}else if (63 == plaats[speler]) {
			System.out.println ("Je hebt gewonnen!");
			break;
			
			}String ingegevene2 = input.nextLine();
			while(ingegevene2.equals("g")== false) {
			}
			
						
						}
				}
		}
	}
			



	

