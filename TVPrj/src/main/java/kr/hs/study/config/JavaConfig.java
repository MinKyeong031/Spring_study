package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class JavaConfig {
	@Bean
	public SonySpeaker sony() {
		return new SonySpeaker();
	}
	@Bean
	public AppleSpeaker apple() {
		return new AppleSpeaker();
	}
	@Bean
	public SamsungTV obj1() {
		SamsungTV tv1 = new SamsungTV();
		tv1.setPrice(30000000);
		tv1.setSpeaker(new SonySpeaker());
		return tv1;
	}
	@Bean
	public LGTV obj2() {
		LGTV tv1 = new LGTV(40000000, new AppleSpeaker());
		return tv1;
	}
}
