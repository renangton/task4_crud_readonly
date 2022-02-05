package com.crud_readonly.entity;

public class Game {
	private Integer id;
	private String name;
	private String genru;
	private String platform;
	private int price;
	
	public Game(Integer id, String name, String genru, String platform, int price) {
		super();
		this.id = id;
		this.name = name;
		this.genru = genru;
		this.platform = platform;
		this.price = price;
	}
	
	public Game() {
		
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenru() {
		return genru;
	}
	public void setGenru(String genru) {
		this.genru = genru;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
