public class walec extends punkt{
	private float r;
	
	void setr(float x){
	if(x>=0){
		r=x;		//kontrola wprowadzonej wartoœci
		}
	if(x<0){
		System.out.println("blad");
		}
	}
	 float getr() {
		 return r;} 
	
	 walec(float m, float r){	//konstruktor superklasy
		 super (m); setr(r);}
	 walec(){
		 super(); setr(0);}	//konsktruktor domyœlny superklasy
	 
	public float moment(){
		float I;
		I=(getmasa()*r*r)/2;	//metoda obliczaj¹cy moment 
		return (I);
		}
	public float steiner(float d){		//metoda obliczaj¹ca moment z tw steinera
		float J;
		J=(moment()+getmasa()*d*d);
		return (J);
		}
	public String toString(){		// opis obiektu, promien
		return "walec: promien " + getr();}
	}
	
