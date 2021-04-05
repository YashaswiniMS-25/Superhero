package com.wolken.wolkenapp.Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter

@ToString

public class SuperHeroBean {
	public SuperHeroBean(String name, String origin, SuperPower superpower) {
		super();
		this.name = name;
		this.origin = origin;
		this.superpower = superpower;
	}
	private String name;
	private String origin;
	private SuperPower superpower;
	 

}
