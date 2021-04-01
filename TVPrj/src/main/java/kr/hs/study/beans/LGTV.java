package kr.hs.study.beans;

public class LGTV implements TV{
	private int price;
	private AppleSpeaker speaker;	

	
	public LGTV() {
		super();
	}

	public LGTV(int price, AppleSpeaker speaker) {
		super();
		this.price = price;
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	public String PowerOn() {
		return "LG TV ÄÑÁü";
	}

	public String PowerOff() {
		return "LG TV ²¨Áü";	
	}

	
}
