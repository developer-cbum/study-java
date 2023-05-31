package anonymousTask;

public class Nike {
	
	public void register(Form form) {
		String[] products = form.getProduct();
		
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 매장입니다.");
			return;
		}
		form.sell("에어");
	}

}
