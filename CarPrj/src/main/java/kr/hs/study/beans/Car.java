package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private int price;
	String name;//차종
	
	public Car() {
		super();
	}

	@Autowired
	public Car(@Value("100")int price, @Value("미니")String name) {
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
