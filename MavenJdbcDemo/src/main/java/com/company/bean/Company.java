package com.company.bean;

public class Company {
	private int cId;
	private String name;
	private long turnOver;
	private String address;
	private String dateOfEstb;
	public Company() {
	}
	public Company(int cId, String name, long turnOver, String address, String dateOfEstb) {
		this.cId = cId;
		this.name = name;
		this.turnOver = turnOver;
		this.address = address;
		this.dateOfEstb = dateOfEstb;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(long turnOver) {
		this.turnOver = turnOver;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfEstb() {
		return dateOfEstb;
	}
	public void setDateOfEstb(String dateOfEstb) {
		this.dateOfEstb = dateOfEstb;
	}
}
