public class kula extends punkt{
	private float r;
	void setr(float x)
	{
		if(x>0){
			r=x;	//kontrola wprowadzonej warto�ci
			}
		if(x<=0){
			System.out.println("blad");
			}
		}
		float getr(){
			return r;} 
		
		kula(float m, float r){
		super(m);		//konstruktor superklasy
		setr(r);
		}
		kula()
		{super(); 	//konsktruktor domy�lny superklasy
		setr(0);
		}
		public float moment(){
			float I;				//metoda obliczaj�cy moment 
			I=(getmasa()*r*r)*(0.4f);
			return I;
		}
		public float steiner (float d){
			float J;				//metoda obliczaj�ca moment z tw steinera
			J=(moment()+getmasa()*d*d);
			return J;
			}
		public String toString(){		// opis obiektu, promien
			return "kula: promien "+getr();
		}
		}
	