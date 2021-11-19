import java.util.Scanner;

public class AutoMain {

	public static void main(String[] args) {
		
//		Auto auto1 = new Auto();
//		auto1.merkki = "Audi";
//		auto1.malli = "Quattro";
//		auto1.bensanmaara = 0;
//		
//		auto1.NaytaTiedot();
//		auto1.kiihdyta();
//		auto1.NaytaTiedot();
//		auto1.tankkaa();
//		auto1.NaytaTiedot();
		
		Auto auto2 = new Auto("Audi", "A6", 40);
		auto2.NaytaTiedot();
		auto2.kiihdyta();
		auto2.kiihdyta();
		auto2.tankkaa();
	}

}

class Auto{
	
	Scanner in = new Scanner(System.in);
	public String merkki;
	public String malli;
	public String tankkaus;
	public int bensanmaara; // kokonaisluku prosentteina 0-100
	
	public Auto(String me, String ma, int be) {
		merkki = me;
		malli = ma;
		bensanmaara = be;
	}
	
	public void jarruta() {
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta() {
		
		if (bensanmaara > 0) {
			System.out.println("Auto kiihdyttaa");
			bensanmaara = bensanmaara - 1;
		}
		else {
			System.out.println("Ei voi kiihdyttaa, tankki tyhja.");
		}
	}
	
	public void NaytaTiedot() {
		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli: " + malli);
		System.out.println("Polttoaineen maara (0-100 %): " + bensanmaara);
	}
	
	public void tankkaa() {
		System.out.println("Tankissa bensaa: " + bensanmaara);
		System.out.println("Montako yksikkoa laitetaan?");
		tankkaus = in.nextLine();
		bensanmaara = bensanmaara + Integer.parseInt(tankkaus);
		
		System.out.println("Tankissa bensaa tankkauksen jalkeen: " + bensanmaara);
	}
}