class GrosseZahl {

	private int[] array; 
	
	// Erzeugt eine Zahl, deren Dezimaldarstellung in d gegeben ist. d besteht ausschließlich aus Dezimalziffern.
	public GrosseZahl(String d) {
		array = new int[d.length()];
		for(int i = 0; i < d.length(); i++ ) {
			array[i] = d.charAt(i) - 48;
		}
	}
	
	//Hilfsmethode für GrosseZahl(int i):
	int ziffernAnzahl(int i) { // liefert die Anzahl von Ziffern einer Zahl zurück
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

	// Liefert eine neue Zahl mit der Summe dieser Zahl und b. Das this-Objekt wird nicht verändert.
	public GrosseZahl add(GrosseZahl b) {
		int length = b.array.length; // die kleinste Länge von gegebenen Zahlen
		if (this.array.length < b.array.length)
			length = this.array.length;
		
		GrosseZahl zahl = new GrosseZahl
		for (int i = 0; i < length; i++) {
			this.array[this.array.length-1]
		}
	}


}
