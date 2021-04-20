package kr.hs.study.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//bean으로 등록하고, 매번 객체를 생성해야 하기 때문에 prototype 속성 줌
//입력이 계속 달라지기 때문에 매번 새로운 객체 생성해야 함!
@Component
@Scope("prototype")
public class LoginDTO {
	private String userid;
	private int userpass;
	
	public LoginDTO() {
		super();
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getUserpass() {
		return userpass;
	}
	public void setUserpass(int userpass) {
		this.userpass = userpass;
	}
}
