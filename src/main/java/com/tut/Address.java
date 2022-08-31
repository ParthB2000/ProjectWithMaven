package com.tut;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adress_id")
	private int addressid;
	
	@Column(length = 50,name="STREET")
	private String street;
	
	@Column(length = 100,name="CITY")
	private String city;
	
	@Column(name="is_open")
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Lob
	private byte[] image;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressid, String street, String city, boolean isopen, double x, Date addDate, byte[] image) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.addDate = addDate;
		this.image = image;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	
}
