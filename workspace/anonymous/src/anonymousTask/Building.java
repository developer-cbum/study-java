package anonymousTask;

public class Building {

	public static void main(String[] args) {
		
		Nike jamsil = new Nike();
		Nike gangnam = new Nike();
		
		
		gangnam.register(new FormAdapter() {
			
			
			@Override
			public String[] getProduct() {
				return new String[] {"����", "����", "����ȭ"};
			}
		});
		
		
		jamsil.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] products = getProduct();
	
				for (int i = 0; i < products.length; i++) {
					if(products[i].equals(order)) {
						System.out.println(order + "�ֹ��Ϸ�");
						return;
					}
				}
				System.out.println("���� ��ǰ�Դϴ�.");

			}
			
			@Override
			public String[] getProduct() {
			
				return new String[] {"����", "����", "����ȭ"};
				
			}
		});
		
		

	}

}