package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void beforeMethod() {
		System.out.println("before ȣ��");
	}
	public void afterMethod() {
		System.out.println("after ȣ��");
	}
	public void aroundMethod1(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around1 �޼��� ȣ����");
		pjp.proceed(); //���� �޼���(�����Ͻ� ����) ȣ��
		System.out.println("around1 �޼��� ��");
	}
	public int aroundMethod2(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around2 �޼��� ȣ����");
		int a=(Integer) pjp.proceed(); /*���� �޼���(�����Ͻ� ����) ȣ��*/
		System.out.println("around2 �޼��� ��");
		return a;
	}
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing �޼��� ȣ��");
	}
	public void afterReturning() {
		System.out.println("afterReturning �޼��� ȣ��");
	}
}