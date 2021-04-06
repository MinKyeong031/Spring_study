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
		System.out.println("TestBean3�� �⺻������");
	}
	
	@PostConstruct
	public void init(){
	    System.out.println("init �޼���");
	}

	@PreDestroy
	public void destroy(){
	    System.out.println("destroy �޼���");       
	}
}
