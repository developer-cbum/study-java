package pratice4;

public class Player {
	
//  (�����׸�)      ���̵�(id), ���ݷ�(atk), ü��(hp), ���ݴ��(target)
//  atk�� hp�� ����� �����ǵ��� ����( > 0)
	
	// �������� ����
	private String id;
	private int atk;
	private int hp;
	private String target;
	

	// �⺻������
	public Player() {;}

	// �ʱ�ȭ ������
	public Player(String id, int atk, int hp, String target) {
		super();
		this.id = id;
		this.atk = atk;
		this.hp = hp;
		this.target = target;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", atk=" + atk + ", hp=" + hp + ", target=" + target + "]";
	}
	
	
	// attack method
	public void attack(Player player1, Player player2) {
		if(player1.getTarget().equals(player2.getId())) {
			player2.setHp(player2.getHp() - player1.getAtk());
		}
	}
	
	

//		id      atk   hp   ���ݴ��
//[1]   �Ƿη�   10   100   Ÿ��
//[2]   Ÿ��   15   80   �Ƿη�
//[1]�� [2]�� �����Ͻð� ������ ����� �� ���� 2�� �����ϸ� ��� �Ǵ��� ����
//attack()�޼ҵ带 Player�� �߰��� ����
//�����ϸ� ������ ü���� �� ���ݷ¸�ŭ ���ҵǵ��� ����

}