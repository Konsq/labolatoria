public class pret extends punkt{
private float l;

void setr(float x)
{
	if(x>0)		//kontrola wprowadzonej wartości
	{
		l=x;
	}
	if(x<=0)
	{
		System.out.println("blad");
	}
}
	float getl()
	{
		return l;
	}

pret(float m, float l)
	{
	super (m); setr(l);		//konstruktor superklasy
	}
pret()
	{
		super ();			//konsktruktor domyślny superklasy
		setr(0);
	}
public float moment()
	{
	float I;				//metoda obliczająca moment
I=(getmasa()*l*l)/12;
return I;
	}
public float steiner(float r)
	{
	float J;			//metoda obliczająca moment z tw steinera
J=(moment()+getmasa()*r*r);
return(J);
	}
public String toString()
	{					// opis obiektu, promien
	return "pret: dlugosc " + getl();}
	}