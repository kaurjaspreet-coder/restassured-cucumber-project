package com.typicode.jsonplaceholder.jsonplaceholder;

public class Post {
	private int userId;
	private int id;
	private String title;
	private String body;
	
	public Post() {
	}
	
	public Post(int id, String title, String body, int userId) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
        }
	
	public Post(String title,String body,int userID) {
		this.title=title;
		this.body=body;
		this.userId=userId;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
