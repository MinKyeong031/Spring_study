package kr.hs.study.beans;

public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2의 기본 생성자");
	}
	public void pr() {
		System.out.println("TestBean2의 출력메서드");
	}
	
	public void init() {
		System.out.println("생성자 호출 다음에 실행되는 init 메서드");
	}
}
