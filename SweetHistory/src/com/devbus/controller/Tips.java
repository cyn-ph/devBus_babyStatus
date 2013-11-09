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
		for (i = 0; i < 10; i++) {
			this.tips.add(new Tip("Tip " + i, "Description", "Advice"));
		}
	}

	public List<Tip> getTips() {
		return tips;
	}

}
