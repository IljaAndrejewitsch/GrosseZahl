
class GrosseZahl {

private int[] array; 

public GrosseZahl(String d) {
	// Erzeugt eine Zahl, deren Dezimaldarstellung in d gegeben ist. d besteht ausschließlich aus Dezimalziffern.
	
	array = new int[d.length()];
	for(int i = 0; i < d.length(); i++ ) {
		array[i] = d.charAt(i) - 48;
	}
}


public boolean less(GrosseZahl b) {
	// Liefert true, wenn diese Zahl echt kleiner als b ist.
	
 
	return false;
}

}
