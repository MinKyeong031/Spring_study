package kr.hs.study.beans;

public class SamsungTV implements TV{
	private int price;
	private SonySpeaker speaker;

	public SamsungTV() {
		super();
	}

	public SamsungTV(int price, SonySpeaker speaker) {
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

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	public String PowerOn() {
		return "»ï¼º TV ÄÑÁü";
	}

	public String PowerOff() {
		return "»ï¼º TV ²¨Áü";	
	}

}
