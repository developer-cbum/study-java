package pratice4;

public class Player {
	
//  (구성항목)      아이디(id), 공격력(atk), 체력(hp), 공격대상(target)
//  atk와 hp는 양수만 설정되도록 구현( > 0)
	
	// 전역변수 선언
	private String id;
	private int atk;
	private int hp;
	private String target;
	

	// 기본생성자
	public Player() {;}

	// 초기화 생성자
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
	
	

//		id      atk   hp   공격대상
//[1]   뽀로로   10   100   타요
//[2]   타요   15   80   뽀로로
//[1]과 [2]를 생성하시고 정보를 출력한 뒤 서로 2번 공격하면 어떻게 되는지 구현
//attack()메소드를 Player에 추가한 다음
//공격하면 상대방의 체력이 내 공격력만큼 감소되도록 구현

}
