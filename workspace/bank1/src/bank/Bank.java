package bank;

public class Bank {
	
	private String name;
	private String account;
	private String phoneNumber;
	private String password;
	// �ڽĿ��Լ��� ������ �� �ְ� ���
	// �޼ҵ� ������ �� ���� ����
	protected int money;

	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAccount() {
		return account;
	}




	public void setAccount(String account) {
		this.account = account;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public int getMoney() {
		return money;
	}




	public void setMoney(int money) {
		this.money = money;
	}




	public Bank() {;}
	
	


//	*static
//	���¹�ȣ �ߺ��˻�
	
	// �޼ҵ�� ��������̴�. final�� ������ �����Ǹ� ���ϵ��� �پ��ش�. 
	// ���¹�ȣ �ߺ��˻� �޼ҵ� ����
	// Ÿ���� Bank ��� ���࿡ �θ� Ŭ������ �޴´�
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		// Bank �ʱ�ȭ ���ش�.
		Bank bank = null;
		// arrBank ������� �ݺ������� ����ؾ� � �������� �� �� ����. 3��
		for (int i = 0; i < arrBank.length; i++) {
			// j�� �ۿ� �����Ͽ� j for�� �ۿ����� ��� �����ϰ� �Ѵ�.
			int j = 0;
			// �״��� 2���� ���� �� ���࿡ �������� ��Ƴ��� arCount[i] �� ��ŭ ���� for�� �ۼ�
			for (j = 0; j < arCount[i]; j++) {
				// arrBank[i][j] =  i = ����, j = ������ ��� ���°� �޼ҵ� �Ű������� account�� ������
				if(arrBank[i][j].getAccount().equals(account)) {
					// ���࿡ �� ���� ��ƶ�
					bank = arrBank[i][j];
					// j for�� break;
					break;
				}
				
			}
			// j �� != arCount[i] �� ���� �� j for���� arCount[i]�� j�� ������������ �ݺ����� ����� ���̴�
			// �ۿ� i �ݺ����� break �ؾ� �ϱ� ������ ���ǽĿ� break �ڵ� ���.
			if(j != arCount[i]) {
				break;
			}
		}
		return bank;
		
	}

//	�ڵ�����ȣ �ߺ��˻�
	
	// �޼ҵ�� ��������̴�. final�� ������ �����Ǹ� ���ϵ��� �پ��ش�. 
	// Ÿ���� Bank ��� ���࿡ �θ� Ŭ������ �޴´�
	public final static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		// Bank �ʱ�ȭ ���ش�.
		// �������� ������ null �� ����
		Bank bank = null;
		// arrBank ������� �ݺ������� ����ؾ� � �������� �� �� ����. 3��
		for (int i = 0; i < arrBank.length; i++) {
			// j�� �ۿ� �����Ͽ� j for�� �ۿ����� ��� �����ϰ� �Ѵ�.
			int j = 0;
			// �״��� 2���� ���� �� ���࿡ �������� ��Ƴ��� arCount[i] �� ��ŭ ���� for�� �ۼ�
			for (j = 0; j < arCount[i]; j++) {
				// arrBank[i][j] =  i = ����, j = ������ ��� �ڵ��� ��ȣ�� �޼ҵ� �Ű������� phoneNumber�� ������
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {
					// ���࿡ �� ���� ��ƶ�
					bank = arrBank[i][j];
					// j for�� break;
					break;
				}
				
			}
			// j �� != arCount[i] �� ���� �� j for���� arCount[i]�� j�� ������������ �ݺ����� ����� ���̴�
			// �ۿ� i �ݺ����� break �ؾ� �ϱ� ������ ���ǽĿ� break �ڵ� ���.
			if(j != arCount[i]) {
				break;
			}
		}
		return bank;
		
	}

	
//	�α��� �޼ҵ� ����
	
	// ���� ���� �ڵ���, ���� �ߺ��˻� ���� Ÿ���� boolean���� �Ͽ����� �ҽ��ڵ带 �� ���� ����Ѵ�.
	// ������, Bank�� �޾Ƽ� ���� �ߺ��˻� �޼ҵ带 ����� �� �ִ�.
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = Bank.checkAccount(arrBank, arCount, account);
		// ���°� �ִٸ�, user ���� ���� null�� �ƴ϶��.
		if(user != null) {
			// �� �н����尡 �Ȱ��ٸ�
			if(user.password.equals(password)) {
				// user�� ����
				return user;
			}
		}
		// ���°� ���ٸ� null ����
		return null;
	}
	
	
	
	
//	*�Ϲ�
//	�Ա�
	// �Ű����� �Ա��� ���� ���� �� �ְ� int money ���
	// �ʵ� �ӴϿ� ���������ڷ� �Է��� money ��ŭ �����ش�.
	public void deposit(int money) {
		this.money += money;
	}

//	���
	public void withdraw(int money) {
		this.money -= money;
	}


//	�ܾ���ȸ
	
	// �������� ������ ����� ��
	// ����Ÿ�� int �ϰ� �ʵ忡 money�� �������ش�.
	public int showBalance() {
		return money;
	}
	

}