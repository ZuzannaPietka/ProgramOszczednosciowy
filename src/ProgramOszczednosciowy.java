

public class ProgramOszczednosciowy {

	public static void main(String[] args) {
		
	
		
		Skarbonka1 skarbonkaAnna = new Skarbonka1 ("Anna Kowalska");
		Skarbonka1 skarbonkaJan = new Skarbonka1 ("Jan Kowalski");
		
		
		
		skarbonkaAnna.wyswietlanie();
		skarbonkaJan.wyswietlanie();
		skarbonkaAnna.dodawanie(2000);
		skarbonkaAnna.wyswietlanie();
		skarbonkaJan.wyswietlanie();
		skarbonkaJan.dodawanie(500);
		skarbonkaAnna.wyswietlanie();
		skarbonkaJan.wyswietlanie();
		skarbonkaAnna.pobieranie(skarbonkaJan);
		skarbonkaAnna.wyswietlanie();
		skarbonkaJan.wyswietlanie();
		skarbonkaAnna.dodawanie(2);
		skarbonkaJan.dodawanie(3);
		skarbonkaAnna.wyswietlanie();
		skarbonkaJan.wyswietlanie();
	}

}
