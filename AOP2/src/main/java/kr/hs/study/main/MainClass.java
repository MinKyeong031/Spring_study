package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;


public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 obj1 = ctx1.getBean("t1", TestBean1.class);
//		obj1.func1();
//		obj1.func2();
//		obj1.func3();
//		System.out.println();
//		
//		obj1.method1();
//		obj1.method2();
//		obj1.method3();
//		System.out.println();
//		
//		TestBean2 obj2 = ctx1.getBean("t2", TestBean2.class);
//		System.out.println("obj2 : " + obj2);
//		obj2.method4();
//		obj2.method5();
		
		System.out.println(obj1.func4());
			
		ctx1.close();	
	}

}
