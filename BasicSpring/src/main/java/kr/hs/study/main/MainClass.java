package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//�����̳��� config.xml ������ �о�´�.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
//		/*
//		��ü�� ������ �´�. -> getBean()
//		getBean()�� ���ϰ� : object
//		�ٿ�ĳ���� ���־�� �Ѵ�
//		TestBean t1 = ctx.getBean(TestBean.class);
//		t1.method();
//		
//		TestBean t2 = (TestBean) ctx.getBean("t2"); */
//		Test t2 = ctx.getBean("t2", TestBean.class); //�� ������� ���־��̴� ���
//		t2.method();
//		System.out.println("T2 : " + t2);
//
//		//singleton : ��ü�� �� �� �������� ��� ���ȴ�. ���� �������� �ʴ´�.
//		Test t3 = ctx.getBean("t2", TestBean.class); 
//		System.out.println("T3 : " + t3);
//		
//		Test t4 = ctx.getBean("t2", TestBean.class); 
//		System.out.println("T4 : " + t4);

		Test t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1 : " + t1);

		Test t2 = ctx.getBean("t1", TestBean.class);
		System.out.println("t2 : " + t2);
		
		Test t3 = ctx.getBean("t1", TestBean.class);
		System.out.println("t3 : " + t3);
		
		
		ctx.close();
	}

}