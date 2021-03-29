package kr.hs.study.beans;

public class TestBean3 {
	private int a;
	private String b;
	private DataBean3 c;

	public TestBean3() {}
	public TestBean3(int a, String b, DataBean3 c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public DataBean3 getC() {
		return c;
	}
	public void setC(DataBean3 c) {
		this.c = c;
	}
	
}
