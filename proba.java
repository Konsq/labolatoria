
public class proba extends punkt{

	   public static void main(String[] args){
	walec w1=new walec(2, 4);  //tworzenie obiektu
	
	//obiekt-walec
	System.out.println(w1.toString());
	System.out.println("Masa "+ w1.getmasa());  
	System.out.println("Moment "+ w1.moment()); 
	System.out.println("Moment wzglêdem nowej osi oddalonej o d=1: J=" + w1.steiner(1));
	System.out.println(""); 
	
kula k1=new kula(3, 5);  //tworzenie obiektu
	
	//obiekt-kula
	System.out.println(k1.toString());
	System.out.println("Masa "+ k1.getmasa()); 	
	System.out.println("Moment "+ k1.moment()); 
	System.out.println("Moment wzglêdem nowej osi oddalonej o d=2: J=" + k1.steiner(2));
	System.out.println(""); 

pret p1=new pret(6, 7);  //tworzenie obiektu
	
	//obiekt-pret
	System.out.println(p1.toString());
	System.out.println("Masa "+ p1.getmasa());  	
	System.out.println("Moment "+ p1.moment()); 
	System.out.println("Moment wzglêdem nowej osi oddalonej o d=3: J=" + p1.steiner(3));
	System.out.println(""); 	
	   
	    
punkt[] tablica=new punkt[3]; //deklaracja tablicy obiektow
tablica[0]=new walec(2, 4);
tablica[1]=new kula(3, 5);
tablica[2]=new pret(6, 7);
//Wyœwietlenie   na   konsoli   informacji   zawieraj¹cej   opis,
//dane   i   wartoœci   g³ównych momentów bezw³adnoœci
for(int i=0; i<=2;i++){		
System.out.println(tablica[i].toString());
System.out.println("Masa "+ tablica[i].getmasa()); 
System.out.println("Moment "+tablica[i].moment());
}
//Wyœwietlenie   wartoœci  momentów  bezw³adnoœci   wzglêdem   nowej   osi
for(int i=0; i<=2;i++){
System.out.println("Moment wzglêdem nowej osi oddalonej o d=3: J=" + tablica[i].steiner(3));
}	 
}}