package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		System.out.println("------------------------------------------------------------------------");

		TestBean2 t5 = ctx1.getBean("obj4", TestBean2.class);
		System.out.println("lazt-init");
		t5.pr();
		System.out.println("------------------------------------------------------------------------");
		
		TestBean2 t6 = ctx1.getBean("obj5", TestBean2.class);
		System.out.println("scope=\"prototype\" : " + t6);
		System.out.println("------------------------------------------------------------------------");

		System.out.println("init() 메서드 넣기");
		TestBean2 t8 = ctx1.getBean("obj7", TestBean2.class);
		System.out.println("------------------------------------------------------------------------");

		TestBean3 t10 = ctx1.getBean("obj9", TestBean3.class);
		System.out.println(t10.getA());
		System.out.println(t10.getB());
		System.out.println(t10.getC());
		System.out.println("------------------------------------------------------------------------");

		ctx1.close();
		System.out.println("\n\n");
		
		
		
		//성정이 있는 자바파일 등록
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);

		//TestBean2 t2 = ctx2.getBean("java1", TestBean2.class);
		//t2.pr();
		//System.out.println("------------------------------------------------------------------------");
		
		TestBean2 t3 = ctx2.getBean("obj2", TestBean2.class);
		t3.pr();
		System.out.println("------------------------------------------------------------------------");
		
		TestBean2 t4 = ctx2.getBean("obj3", TestBean2.class);
		System.out.println("lazt-init");
		t4.pr();
		System.out.println("------------------------------------------------------------------------");
		
		TestBean2 t7 = ctx2.getBean("obj6", TestBean2.class);
		System.out.println("scope=\"prototype\" : " + t7);
		System.out.println("------------------------------------------------------------------------");

		System.out.println("init() 메서드 넣기");
		TestBean2 t9 = ctx2.getBean("obj8", TestBean2.class);
		System.out.println("------------------------------------------------------------------------");
		
		TestBean3 t11 = ctx2.getBean("obj10", TestBean3.class);
		System.out.println(t11.getA());
		System.out.println(t11.getB());
		System.out.println(t11.getC());
		System.out.println("------------------------------------------------------------------------");

		TestBean3 t12 = ctx2.getBean("obj11", TestBean3.class);
		System.out.println(t12.getA());
		System.out.println(t12.getB());
		System.out.println(t12.getC());
		System.out.println("------------------------------------------------------------------------");
		

		TestBean4 t13 = ctx2.getBean("obj12", TestBean4.class);
		System.out.println(t13.getData1());
		System.out.println(t13.getData2());
		System.out.println("------------------------------------------------------------------------");
		
		ctx2.close();
		
	}

}
