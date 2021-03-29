package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean4 {
	private int data1;

	@Autowired
	private DataBean4 data2;
	
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean4 getData2() {
		return data2;
	}
	public void setData2(DataBean4 data2) {
		this.data2 = data2;
	}
	
}
/*
자동주입
Autowired(객체일때만)
1. 멤버변수 위에
2. setter 위에
3. 생성자
 */