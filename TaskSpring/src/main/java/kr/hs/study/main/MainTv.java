package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.Tv;


public class MainTv {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		Tv stv = ctx.getBean("stv", SamsungTv.class);
		System.out.println("stv : " + stv);
		
		Tv ltv = ctx.getBean("ltv", LgTv.class);
		System.out.println("ltv : " + ltv);

		ctx.close();
	}
}
