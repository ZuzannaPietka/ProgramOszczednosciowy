public class Skarbonka1 {

	 String imie;
	 int[] myArray = new int [2];
	 int suma;
	
	
	public Skarbonka1 (String imie) {
		this.imie = imie;

	}

	public void dodawanie (int kwoty) {
	
		myArray [0] = kwoty;
		suma += myArray[0];	
		
	}
	
	public void  wyswietlanie () {	
		System.out.println("Imi� w�a�ciciela to: "+imie+", a suma zgromadzonych oszcz�dno�ci to "+suma);
		System.out.println("----------------------------------------------------------");
	}
	public void pobieranie (Skarbonka1 skarbonka1) {
		
		skarbonka1.dodawanie(suma);
		
	

	
		
		
	}
}
