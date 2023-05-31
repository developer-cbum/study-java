package anonymousTask;

public class Building {

	public static void main(String[] args) {
		
		Nike jamsil = new Nike();
		Nike gangnam = new Nike();
		
		
		gangnam.register(new FormAdapter() {
			
			
			@Override
			public String[] getProduct() {
				return new String[] {"에어", "조던", "러닝화"};
			}
		});
		
		
		jamsil.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] products = getProduct();
	
				for (int i = 0; i < products.length; i++) {
					if(products[i].equals(order)) {
						System.out.println(order + "주문완료");
						return;
					}
				}
				System.out.println("없는 상품입니다.");

			}
			
			@Override
			public String[] getProduct() {
			
				return new String[] {"에어", "조던", "러닝화"};
				
			}
		});
		
		

	}

}
