package interfaceTest;

public abstract class AnimalAdapter implements Animal {
	
	// 어댑터 생성시 인터페이스 add 검색해서 해야 밑에 재정의 메소드 나온다.
	
	@Override
	public void showHands() {;}

	@Override
	public void sitDown() {;}

	@Override
	public void touchNose() {;}

	@Override
	public void waitNow() {;}

	// 반드시 구현해야하는 것은 어댑터에서 재정의 하지마라.
	//@Override
	//public void poop() {;}

}
