package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;


@Configuration
public class JavaConfig {
	
	@Bean
	public DataBean1 db1() {
		return new DataBean1();
	}
	
	@Bean
	public TestBean1 obj1() {
		return new TestBean1(db1(), db1());
	}
	
}