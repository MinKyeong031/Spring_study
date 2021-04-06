package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj2")
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
	}
	
	@PostConstruct
	public void init(){
	    System.out.println("init 메서드");
	}

	@PreDestroy
	public void destroy(){
	    System.out.println("destroy 메서드");       
	}
}
