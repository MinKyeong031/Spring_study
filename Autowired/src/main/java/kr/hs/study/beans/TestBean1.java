package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	private int data1;
	private double data2;
	
	@Autowired //type으로 주입
	@Qualifier("obj1") //id로 주입
	private DataBean1 data3;
	
	@Autowired
	private DataBean1 data4;

	public TestBean1() {}
	public TestBean1(DataBean1 data3, DataBean1 data4) {
		this.data3 = data3;
		this.data4 = data4;
	}
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public double getData2() {
		return data2;
	}
	public void setData2(double data2) {
		this.data2 = data2;
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
