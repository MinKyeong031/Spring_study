package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		/* HelloWorldEn 객체 가져오기 */
		Hello h1 = ctx.getBean("hello1", HelloWorldEn.class);
		h1.sayHello();
		

		/* HelloWorldEn 객체 가져와서 h2에 넣고 메서드 호출 */
		Hello h2 = ctx.getBean("hello2", HelloWorldKo.class);
		h2.sayHello();
		
		ctx.close();
	}
}
