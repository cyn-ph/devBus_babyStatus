package com.devbus.controller;

import java.util.ArrayList;
import java.util.List;

import com.devbus.data.Symptom;

public class Symptoms {
	
	List<Symptom> symptoms;

	public Symptoms() {
		super();
	}

	public void fillList() {
		this.symptoms = new ArrayList<Symptom>();
		int i = 0;
		for (i = 0; i < 10; i++) {
			this.symptoms.add(new Symptom("09-11-2013", "Description"));
		}
	}

	public List<Symptom> getSymptoms() {
		return symptoms;
	}

}
