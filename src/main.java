

public class main { // 	 ---	M ain!!! 

	public static void main(String[] args) {
		
		GrosseZahl s1 = new GrosseZahl("123455555555");
		GrosseZahl s2 = new GrosseZahl("9934511");
		System.out.println(s1.toString() + " + " + s2.toString() + " = " + s1.add(s2).toString());
		
		GrosseZahl s3 = new GrosseZahl("0");
		GrosseZahl s4 = new GrosseZahl("0");
		System.out.println(s3.toString() + " + " + s4.toString() + " = " + s3.add(s4).toString());
	}

}
