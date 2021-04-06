package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		System.out.println("------------------------------------------------------------------------");

		TestBean2 t3 = ctx1.getBean(TestBean2.class);
		System.out.println("t3 : " + t3);
		System.out.println("------------------------------------------------------------------------");

		TestBean3 t5 = ctx1.getBean("obj2", TestBean3.class);
		System.out.println("t5 : " + t5);
		System.out.println("------------------------------------------------------------------------");

		TestBean3 t6 = ctx1.getBean("obj2", TestBean3.class);
		System.out.println("t6 : " + t6);
		System.out.println("------------------------------------------------------------------------");

		TestBean4 t7 = ctx1.getBean(TestBean4.class);
		System.out.println("t7.data1 : " + t7.getData1());
		System.out.println("t7.data2 : " + t7.getData2());
		System.out.println("t7.data4 : " + t7.getData4());
		System.out.println("t7.data5 : " + t7.getData5());
		System.out.println("------------------------------------------------------------------------");

		TestBean5 t8 = ctx1.getBean(TestBean5.class);
		System.out.println("t8.A : " + t8.getA());
		System.out.println("t8.B : " + t8.getB());
		System.out.println("t8.C : " + t8.getC());
		System.out.println("t8.D : " + t8.getD());
		System.out.println("------------------------------------------------------------------------");

		TestBean5 t9 = ctx1.getBean("testBean5", TestBean5.class);
		System.out.println("t9.A : " + t9.getA());
		System.out.println("t9.B : " + t9.getB());
		System.out.println("t9.C : " + t9.getC());
		System.out.println("t9.D : " + t9.getD());
		System.out.println("------------------------------------------------------------------------\n");
		
		
		ctx1.close();
		


		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);


		TestBean1 t2 = ctx2.getBean("obj1", TestBean1.class);
		System.out.println("t2 : " + t2);
		System.out.println("------------------------------------------------------------------------");
		
		TestBean1 t4 = ctx2.getBean(TestBean1.class);
		System.out.println("t4 : " + t4);
		System.out.println("------------------------------------------------------------------------");

		TestBean5 t10 = ctx2.getBean("java1", TestBean5.class);
		System.out.println("t10.A : " + t10.getA());
		System.out.println("t10.B : " + t10.getB());
		System.out.println("t10.C : " + t10.getC());
		System.out.println("t10.D : " + t10.getD());
		System.out.println("------------------------------------------------------------------------\n");
		
		ctx2.close();
		
	}

}
