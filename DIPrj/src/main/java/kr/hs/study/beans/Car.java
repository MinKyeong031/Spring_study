package kr.hs.study.beans;

public class Car {
	private int price;
	String name;//ย๗มพ
	
	public Car() {
		super();
	}

	public Car(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
