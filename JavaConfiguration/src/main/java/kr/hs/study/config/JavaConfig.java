package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

@Configuration
//설정파일로 인식할 수 있게 해줌

public class JavaConfig {
	@Bean(name="obj2")
	public TestBean2 java1() {
		TestBean2 t1 = new TestBean2();
		return t1;
	}//메소드 이름이 id가 된다.
	//<bean id="java1" class="kr.hs.study.TestBean2"/>과 동일

	@Bean
	@Lazy
	public TestBean2 obj3() {
		return new TestBean2();
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public TestBean2 obj6() {
		return new TestBean2();
	}
	
	@Bean(initMethod="init")
	@Lazy
	@Scope("prototype")
	public TestBean2 obj8() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean3 obj10() {
		TestBean3 t3 = new TestBean3(300, "spring3", new DataBean3());
		return t3;
	}
	 
	@Bean
	public TestBean3 obj11() {
		TestBean3 t3 = new TestBean3();
		t3.setA(500);
		t3.setB("spring5");
		t3.setC(new DataBean3());
		return t3;
	}

	@Bean
	public DataBean4 data2() {
		return new DataBean4();
	}
	@Bean
	public TestBean4 obj12() {
		return new TestBean4();
	}
	
}

















