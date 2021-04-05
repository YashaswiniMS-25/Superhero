package com.wolken.wolkenapp.Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter

@ToString
public class SuperPower {
	public SuperPower(String power, int noOfPowers) {
		super();
		this.power = power;
		this.noOfPowers = noOfPowers;
	}
	private String power;
	private int noOfPowers;
	
	

}
