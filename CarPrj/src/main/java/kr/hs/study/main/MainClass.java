package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

//		CarUser c1 = ctx.getBean("obj1", CarUser.class);
//		System.out.println("c1.owner : " + c1.getOwner());
//		System.out.println("c1.color : " + c1.getColor());
//		System.out.println("c1.car_type : " + c1.getCar_type());
//		
//		CarUser c2 = ctx.getBean("obj2", CarUser.class);
//		System.out.println("c2.owner : " + c2.getOwner());
//		System.out.println("c2.color : " + c2.getColor());
//		System.out.println("c2.car_type : " + c2.getCar_type());
//		
//		CarUser c3 = ctx.getBean("obj3", CarUser.class);
//		System.out.println("c3.owner : " + c3.getOwner());
//		System.out.println("c3.color : " + c3.getColor());
//		System.out.println("c3.car_type : " + c3.getCar_type());
		
		CarUser c4 = ctx.getBean(CarUser.class);
		System.out.println("c4.owner : " + c4.getOwner());
		System.out.println("c4.color : " + c4.getColor());
		System.out.println("c4.car_type : " + c4.getCar_type());
		System.out.println("c4.car_type.name : " + c4.getCar_type().getName());
		System.out.println("c4.car_type.price : " + c4.getCar_type().getPrice());
		
		
		ctx.close();
	}

}
