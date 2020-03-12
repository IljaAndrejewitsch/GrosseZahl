package groessezahlen;


class GrosseZahl {

 public GrosseZahl(String d) {
	 int[] array = new int[d.length()];
	 for(int i = 0; i >= d.length(); i++ ) {
		 array[i] = d.charAt(i);
		 System.out.print(d.charAt(i));
	 }
 }
 
 
}
