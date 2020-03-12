class GrosseZahl {

	private int[] array; 
	
	// Default-Konstruktor, der eine Länge nimmt und eine grosse Zahl damit erzeugt
	public GrosseZahl() {} // Notwendig, um die Konsistenz im Code zu behalten (nicht mit einfachen Arrays zu arbeiten)
		
	// Erzeugt eine Zahl, deren Dezimaldarstellung in d gegeben ist. d besteht ausschließlich aus Dezimalziffern.
	public GrosseZahl(String d) {
		array = new int[d.length()];
		for(int i = 0; i < d.length(); i++ ) {
			array[i] = d.charAt(i) - 48;
		}
	}
	
	//Hilfsmethode für GrosseZahl(int i)
	private int ziffernAnzahl(int i) { // liefert die Anzahl von Ziffern einer Zahl zurück
		if (i != 0) { // 0 ist ein Ausnahmefall
			int anzahl = 0; // die Anzahl von Ziffern
			 while (i > 0) {
				 anzahl++;
				 i /= 10;
			 }
		
			return anzahl;
		}
		
		return 1; // wenn die Zahl = 0 ist, dann besteht die aus einer Ziffer
	}
	
	// Erzeugt eine Zahl mit dem Wert von i.
	public GrosseZahl(int i) {
		int length = ziffernAnzahl(i);
		array = new int[length];
		for (int j = length - 1; j >= 0; j++) { // letze Ziffer auf den letzen Platz des Arrays
			array[j] = i % 10;
			i /= 10;
		}
	}
	
	// Gibt die Zahl als String zurück.
	public String toString() {
		String zahl  = "";
		for (int i = 0; i < this.array.length; i++)
			zahl += this.array[i];
		
		return zahl;
	}
	
	// Liefert true, wenn diese Zahl echt kleiner als b ist.
	public boolean less(GrosseZahl b) {
		
		
	 
		return false;
	}

	// Hilfsmethode für GrosseZahl add(GrosseZahl b)
	private GrosseZahl nochEineStelle(int nullenAnzahl) { // fügt beliebig viele Nullen vor der Zahl in einem GrosseZahl.array hinzu
							  // z.B. [1,2,3] -> [0,1,2,3]
		GrosseZahl neueZahl = new GrosseZahl();
		neueZahl.array = new int[this.array.length+nullenAnzahl];
		
		for (int i = 0; i < nullenAnzahl; i++) // die neuen Nullen
			neueZahl.array[i] = 0;
		
		for (int i = 0; i < this.array.length; i++) // kopieren den übrigen Inhalt des alten Arrays
			neueZahl.array[i+nullenAnzahl] = this.array[i];
		
		return neueZahl;
	}
	
	// Liefert eine neue Zahl mit der Summe dieser Zahl und b. Das this-Objekt wird nicht verändert.
	public GrosseZahl add(GrosseZahl b) {
		GrosseZahl zahl1;
		GrosseZahl zahl2; // Ergebnis = zahl1 + zahl2
		
		if (this.array.length != b.array.length) { // die Summanden zahl1 und zahl2 sollen die gleichen Längen besitzen
			if (this.array.length < b.array.length) { // die Zahl this (das aktuelle Objekt) soll verlängert werden
				zahl1 = this.nochEineStelle(b.array.length-this.array.length);
				zahl2 = b;
			}
			else { // die Zahl b soll verlängert werden
				zahl1 = this;
				zahl2 = b.nochEineStelle(this.array.length-b.array.length);
			}
		}
		else {
			zahl1 = this;
			zahl2 = b;
		}
		// zahl1.array.length = zahl2.array.length 
		
		// Addition beginnt
		GrosseZahl ergebnis = new GrosseZahl();
		ergebnis.array = new int[zahl1.array.length];
		int stelleSum; // Summe an einer Stelle (min 0, max 19)
		int rest = 0;  // Rest-Übertrag (0 oder 1)
		for (int i = zahl1.array.length-1; i >= 0; i--) {
			stelleSum = zahl1.array[i] + zahl2.array[i] + rest;
			ergebnis.array[i] = stelleSum % 10; // z.B. 9+9=18, nehmen 8, Übertrag 1
			rest = stelleSum / 10;
		}
		
		if (rest != 0) { // wenn es noch einen Übertrag gibt
			GrosseZahl groesseresErgebnis = ergebnis.nochEineStelle(1);
			groesseresErgebnis.array[0] = rest;
			
			return groesseresErgebnis;
		}
		
		return ergebnis;
	}


}
