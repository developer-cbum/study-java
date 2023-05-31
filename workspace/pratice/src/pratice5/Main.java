package pratice5;

public class Main {

	public static void main(String[] args) {
		
		Class c = new Class();

		
		int[] arData = {1, 2, 3, 4, 5};
		
		for (int i = 0; i <c.cutArray(arData, 1, 3).length ; i++) {
			System.out.println(c.cutArray(arData, 1, 3)[i]);
			
		}

	}

}
