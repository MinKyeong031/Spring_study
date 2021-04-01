package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean1 {
	private DataBean1 data3;
	private DataBean1 data4;
	
	public TestBean1() {
		super();
	}
	@Autowired
	public TestBean1(DataBean1 data3, DataBean1 data4) {
		super();
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public DataBean1 getData3() {
		return data3;
	}
	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}
	public DataBean1 getData4() {
		return data4;
	}
	public void setData4(DataBean1 data4) {
		this.data4 = data4;
	}	
}
