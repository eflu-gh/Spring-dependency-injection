package com.eflu.dependency.injection;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int id;
	private String name;
	private String nickName;

	public Person(int id, String name, String nickName) {
		this.id = id;
		this.name = name;
		this.nickName = nickName;
		System.out.println("Constructor with all parameteres called...");
	}

	public Person(int id) {
		this.id = id;
		System.out.println("Constructor with Id parameter called...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
