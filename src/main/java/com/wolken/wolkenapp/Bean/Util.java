package com.wolken.wolkenapp.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("context.xml");
		SuperHeroBean bean1=applicationcontext.getBean(SuperHeroBean.class);
		System.out.println(bean1.getName());
		System.out.println(bean1.getOrigin());
		SuperPower bean2= applicationcontext.getBean(SuperPower.class);
		System.out.println(bean2.getPower());
		System.out.println(bean2.getNoOfPowers());

	}

}
