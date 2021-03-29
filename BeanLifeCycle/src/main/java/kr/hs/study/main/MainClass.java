package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		System.out.println("obj1 : " + obj1);

		ctx.close();
	}

}
