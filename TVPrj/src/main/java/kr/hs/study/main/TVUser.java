package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.config.JavaConfig;


public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		SamsungTV st1 = ctx1.getBean("obj1", SamsungTV.class);
		System.out.println("伙己 TV, xml 颇老 SetterDI");
		System.out.println("price : " + st1.getPrice());
		System.out.println("speaker : " + st1.getSpeaker());
		System.out.println("speaker.VolumeUp() : " + st1.getSpeaker().VolumeUp());
		System.out.println("speaker.VolumeDown() : " + st1.getSpeaker().VolumeDown());
		System.out.println("PowerOn() : " + st1.PowerOn());
		System.out.println("PowerOff() : " + st1.PowerOff());

		System.out.println("\n-----------------------------------------------\n");
		
		LGTV lt1 = ctx1.getBean("obj2", LGTV.class);
		System.out.println("LG TV, xml 颇老 ConstructorDI");
		System.out.println("price : " + lt1.getPrice());
		System.out.println("speaker : " + lt1.getSpeaker());
		System.out.println("speaker.VolumeUp() : " + lt1.getSpeaker().VolumeUp());
		System.out.println("speaker.VolumeDown() : " + lt1.getSpeaker().VolumeDown());
		System.out.println("PowerOn() : " + lt1.PowerOn());
		System.out.println("PowerOff() : " + lt1.PowerOff());
		
		ctx1.close();
		
		System.out.println("\n================================================\n");

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SamsungTV st2 = ctx2.getBean("obj1", SamsungTV.class);
		System.out.println("伙己 TV, java 颇老 SetterDI");
		System.out.println("price : " + st2.getPrice());
		System.out.println("speaker : " + st2.getSpeaker());
		System.out.println("speaker.VolumeUp() : " + st2.getSpeaker().VolumeUp());
		System.out.println("speaker.VolumeDown() : " + st2.getSpeaker().VolumeDown());
		System.out.println("PowerOn() : " + st2.PowerOn());
		System.out.println("PowerOff() : " + st2.PowerOff());

		System.out.println("\n-----------------------------------------------\n");
		
		LGTV lt2 = ctx2.getBean("obj2", LGTV.class);
		System.out.println("LG TV, java 颇老 ConstructorDI");
		System.out.println("price : " + lt2.getPrice());
		System.out.println("speaker : " + lt2.getSpeaker());
		System.out.println("speaker.VolumeUp() : " + lt2.getSpeaker().VolumeUp());
		System.out.println("speaker.VolumeDown() : " + lt2.getSpeaker().VolumeDown());
		System.out.println("PowerOn() : " + lt2.PowerOn());
		System.out.println("PowerOff() : " + lt2.PowerOff());
		
		ctx2.close();
	}
}
