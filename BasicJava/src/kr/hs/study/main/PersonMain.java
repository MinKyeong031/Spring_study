package kr.hs.study.main;

import kr.hs.study.beans.Person;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("kim");
		p1.setAge(30);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person("lee", 25);
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}

}
