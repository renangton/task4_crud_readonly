package com.crud_readonly.entity;

public class Game {
	private String id;
	private String name;
	private String genre;
	private String platform;
	private int price;

	public Game(String id, String name, String genre, String platform, int price) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.platform = platform;
		this.price = price;
	}

	public Game() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
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
