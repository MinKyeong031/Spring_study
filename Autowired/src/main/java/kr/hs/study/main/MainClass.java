package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xml 설정
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		/*
		TestBean1 t2 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t2.data1 : " + t2.getData1());
		System.out.println("t2.data2 : " + t2.getData2());
		System.out.println("t2.data3 : " + t2.getData3());
		System.out.println("t2.data4 : " + t2.getData4());
		System.out.println();
		
		TestBean1 t4 = ctx1.getBean("obj2", TestBean1.class);
		System.out.println("t4.data1 : " + t4.getData1());
		System.out.println("t4.data2 : " + t4.getData2());
		System.out.println("t4.data3 : " + t4.getData3());
		System.out.println("t4.data4 : " + t4.getData4());
		System.out.println();
		*/
		TestBean1 t6 = ctx1.getBean("obj3", TestBean1.class);
		System.out.println("t6.data1 : " + t6.getData1());
		System.out.println("t6.data2 : " + t6.getData2());
		System.out.println("t6.data3 : " + t6.getData3());
		System.out.println("t6.data4 : " + t6.getData4());
		System.out.println();
		
		
		ctx1.close();
		System.out.println("--------------------------------------------------------------------------");
		
		
		
		//java 설정
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		/*
		TestBean1 t1 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data2 : " + t1.getData2());
		System.out.println("t1.data3 : " + t1.getData3());
		System.out.println("t1.data4 : " + t1.getData4());
		System.out.println();
		
		TestBean1 t3 = ctx2.getBean("java2", TestBean1.class);
		System.out.println("t3.data1 : " + t3.getData1());
		System.out.println("t3.data2 : " + t3.getData2());
		System.out.println("t3.data3 : " + t3.getData3());
		System.out.println("t3.data4 : " + t3.getData4());
		System.out.println();
		
		TestBean1 t5 = ctx2.getBean("java1", TestBean1.class);
		System.out.println("t5.data1 : " + t5.getData1());
		System.out.println("t5.data2 : " + t5.getData2());
		System.out.println("t5.data3 : " + t5.getData3());
		System.out.println("t5.data4 : " + t5.getData4());
		System.out.println();
		*/
		TestBean1 t7 = ctx2.getBean("java3", TestBean1.class);
		System.out.println("t7.data1 : " + t7.getData1());
		System.out.println("t7.data2 : " + t7.getData2());
		System.out.println("t7.data3 : " + t7.getData3());
		System.out.println("t7.data4 : " + t7.getData4());
		System.out.println();
		
		ctx2.close();
		
	}

}
