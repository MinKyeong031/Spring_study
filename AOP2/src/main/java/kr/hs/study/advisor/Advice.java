package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void beforeMethod() {
		System.out.println("before ȣ��");
	}
	public void afterMethod() {
		System.out.println("after ȣ��");
	}
	public int aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around �޼��� ��");
		int a = (Integer)pjp.proceed();//���� �޼���(����Ͻ� ����)ȣ��
		System.out.println("around �޼��� ��");
		return a;
	}
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing �޼��� ȣ��");
	}
	public void afterReturning() {
		System.out.println("afterReturning �޼��� ȣ��");
	}
}
