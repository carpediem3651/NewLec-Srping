package kr.co.rland.web.entity;

import java.util.Date;

public class Menu {
	// 속성 정의 (데이터베이스 속성명)
	// 생성자 최소 두가지
	// getter, setter
	// toString
	private long id;
	private String korName;
	private String engName;
	private int price;
	private String img;
	private Date regDate;
	private int hit;
	private long memberId;
	
	public Menu() {
		
	}

	public Menu(long id, String korName, String engName, int price, String img, Date regDate, int hit, long memberId) {
		super();
		this.id = id;
		this.korName = korName;
		this.engName = engName;
		this.price = price;
		this.img = img;
		this.regDate = regDate;
		this.hit = hit;
		this.memberId = memberId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKorName() {
		return korName;
	}

	public void setKorName(String korName) {
		this.korName = korName;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", korName=" + korName + ", engName=" + engName + ", price=" + price + ", img=" + img
				+ ", regDate=" + regDate + ", hit=" + hit + ", memberId=" + memberId + "]";
	}
	
}
