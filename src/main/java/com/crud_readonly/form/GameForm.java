package com.crud_readonly.form;


// 画面から入力された値を受け取る
public class GameForm {
	private String id;
	private String order;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
	
}
