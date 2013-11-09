package com.devbus.controller;

import java.util.ArrayList;
import java.util.List;

import com.devbus.data.Tip;

public class Tips {

	List<Tip> tips;

	public Tips() {
		super();
	}

	public void fillList() {
		this.tips = new ArrayList<Tip>();
		int i = 0;
		this.tips.add(new Tip("Tip ", "Description", "Advice",1));
		this.tips.add(new Tip("Tip ", "Description", "Advice",2));
		this.tips.add(new Tip("Tip ", "Description", "Advice",3));
		this.tips.add(new Tip("Tip ", "Description", "Advice",4));
		this.tips.add(new Tip("Tip ", "Description", "Advice",5));
		
	}

	public List<Tip> getTips() {
		return tips;
	}

}
