package edu.swjtuhc.demo.model;

import javax.xml.crypto.Data;

public class Discuss {
	String username;
	String content;
	Data data;
	int favour;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}

	
	public int getFavour() {
		return favour;
	}
	public void setFavour(int favour) {
		this.favour = favour;
	}
	@Override
	public String toString() {
		return "Discuss [username=" + username + ", content=" + content + ", data=" + data + ", favour=" + favour + "]";
	}
	
	
}