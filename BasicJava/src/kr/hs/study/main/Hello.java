package kr.hs.study.main;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.helloInter;

public class Hello {

	public static void main(String[] args) {
		HelloWorldEn h1 = new HelloWorldEn();
		h1.sayHello();
		
		HelloWorldKo h2 = new HelloWorldKo();
		h2.sayHello();
		
		helloInter h3 = new HelloWorldEn();
		h3.sayHello();
		
		helloInter h4 = new HelloWorldKo();
		h4.sayHello();
	}

}
