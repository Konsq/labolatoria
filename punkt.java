
public class punkt {
	
	private float masa; //prywatne pole, definiowanie masy
	void setmasa(float m) //przypisanie wartosci masy
	{
		masa=m;
		if ( masa < 0 ) {System.out.println("bledna masa, przyjmuje |masa|"); 
masa =-m; 
}} //akcesor, gdy podana jest ujemna liczba zamiast masy, to program poprawia
	float getmasa(){
		return masa;
		}

	punkt(float a){
		setmasa(a); //konstruktor z parametrem
	}
	punkt(){
		setmasa(0); //konstruktor domyslny
	}
	public float moment(){
		return(0); //Metoda bez parametrow, obliczająca glowny moment bezwladnosci
	}
	public float steiner(float d){
		float J;
		J=(moment()+masa*d*d);  //Metoda przyjmujaca jeden parametr, obliczajaca moment bezwladnosci z tw. Steinera.
		return(J);
	}
	public void opis(){
		System.out.println("Punkt materialny"); //Metoda zwracajaca staly opis obiektu
	}
}
