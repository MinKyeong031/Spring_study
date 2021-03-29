package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//ClassPathXmlApplicationContext는 IOC Container의 일종, ApplicationContext가 최상위지만 인터페이스라 객체 생성불가
		//ApplicationContext를 상속받은 ClassPathXmlApplicationContext 사용
		//getBean()을 사용하여 main클래스로 가져옴

		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		System.out.println();
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2 : " + t2);
		System.out.println();
		
		TestBean1 t3 = ctx.getBean("obj2", TestBean1.class);
		System.out.println("t3 a : " + t3.getA());
		System.out.println("t3 b : " + t3.getB());
		System.out.println("t3 c : " + t3.getC());
		System.out.println("t3 d : " + t3.getD1());
		System.out.println();
		
		TestBean1 t4 = ctx.getBean("obj3", TestBean1.class);
		System.out.println("t4 a : " + t4.getA());
		System.out.println("t4 b : " + t4.getB());
		System.out.println("t4 c : " + t4.getC());
		System.out.println("t4 d : " + t4.getD1());
		System.out.println();

		TestBean1 t5 = ctx.getBean("obj4", TestBean1.class);
		System.out.println("t5.d1 : " + t5.getD1());
		System.out.println();

		TestBean1 t6 = ctx.getBean("obj5", TestBean1.class);
		System.out.println("t6.d1 : " + t6.getD1());
		System.out.println();

		TestBean1 t7 = ctx.getBean("obj6", TestBean1.class);
		System.out.println("t7.d1 : " + t7.getD1());
		System.out.println();
		
		TestBean1 t8 = ctx.getBean("obj7", TestBean1.class);
		System.out.println("t8 a : " + t8.getA());
		System.out.println("t8 b : " + t8.getB());
		System.out.println("t8 c : " + t8.getC());
		System.out.println("t8 d : " + t8.getD1());
		System.out.println();

		
		ctx.close();

	}
}
