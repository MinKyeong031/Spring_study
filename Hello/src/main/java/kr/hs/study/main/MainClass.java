package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloJp;
import kr.hs.study.beans.HelloKr;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloKr h1 = ctx.getBean("obj1", HelloKr.class);
		HelloEn h2 = ctx.getBean("obj2", HelloEn.class);
		HelloJp h3 = ctx.getBean("obj3", HelloJp.class);
		
		System.out.println("----------------before------------------");
		h1.Hello1();
		h1.Hello2();
		h1.Hello3();
		h2.Hi1();
		h2.Hi2();
		h2.Hi3();
		System.out.println("----------------after------------------");
		h2.Hi1();
		h2.Hi2();
		h2.Hi3();
		System.out.println("----------------around------------------");
		h1.Hello1();
		h2.Hi1();
		System.out.println("------------after-returning-------------");
		h2.Hi2();
		h3.bye2();
		
		ctx.close();
	}
	
}
