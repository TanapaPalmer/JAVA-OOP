package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {

	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if (pin < 1000 || pin > 9999) {
			return false;
		}
		this.pin = pin;
		return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		
		if (this.id == confirmedAuthID) {
			return true;
		}
		return false;
	}

}