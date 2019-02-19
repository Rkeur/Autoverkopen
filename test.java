
public class test {
	public static void main (String args[]) {
		Auto auto = new Auto();
		AutoZaak volkswagen = new AutoZaak();
		volkswagen.verkopen(199);
		//Auto auto2 = new Auto ();
		//auto2.merk = "volkswagen";
		//auto2.kilometer = 150;
		//auto.rijden();
		//auto2.rijden();
		
	}
}

class Auto{
	String motor;
	String merk = "audi";
	int kilometer = 200;

	void rijden() {
		System.out.println("De "+merk+" gaat "+kilometer+" kilometer per uur");
	}
}
class AutoZaak{

Auto verkopen(int geld) {
	if(geld == 200) {
		Auto autoVerkocht = new Auto ();
		System.out.println("Auto is verkocht");
		return autoVerkocht;
	}else {
		System.out.println("Dit is te weinig geld");
		return null;
		
		}
	}
}