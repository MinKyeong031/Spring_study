package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;


@Configuration
public class JavaConfig {
	@Bean(name="obj1")
	public DataBean1 db1() {
		return new DataBean1();
	}
	/*
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	//Setter로 세팅
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(11);
		t1.setData2(11.11);
		t1.setData3(new DataBean1());
		t1.setData4(new DataBean1());
		return t1;
	}
	*/
	//생성자로 세팅
	@Bean
	public TestBean1 java3() {
		TestBean1 t1 = new TestBean1(new DataBean1(), new DataBean1());
		t1.setData1(11);
		t1.setData2(11.11);
		return t1;
	}
	
}