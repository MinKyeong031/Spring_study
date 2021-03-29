package kr.hs.study.beans;

public class TestBean1 {
	private int a;
	private double b;
	private String c;
	private DataBean1 d1;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}

	public TestBean1(DataBean1 d) {
		this.d1 = d;
	}
	
	public TestBean1(int a, double b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public TestBean1(int a, double b, String c, DataBean1 d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d1 = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public DataBean1 getD1() {
		return d1;
	}

	public void setD1(DataBean1 d) {
		this.d1 = d;
	}
	
}