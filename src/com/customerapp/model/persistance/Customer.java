package com.customerapp.model.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mode1_customer_table")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String customerName;
	private String email;
	private String mob;
	private String place;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Customer(String customerName, String email, String mob, String place) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.mob = mob;
		this.place = place;
	}
	public Customer() {
		super();
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", email=" + email + ", mob=" + mob
				+ ", place=" + place + "]";
	}
	
	

}
