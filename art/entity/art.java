package com.art.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class art 
{
	@Id
	int artId;
	String artName;
	double artprice;
	boolean available;
	
	public art()
	{
		
	}
	public art(int artId, String artName, double artprice, boolean available) {
		super();
		this.artId = artId;
		this.artName = artName;
		this.artprice = artprice;
		this.available = available;
	}
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public String getArtName() {
		return artName;
	}
	public void setArtName(String artName) {
		this.artName = artName;
	}
	public double getArtprice() {
		return artprice;
	}
	public void setArtprice(double artprice) {
		this.artprice = artprice;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "art [artId=" + artId + ", artName=" + artName + ", artprice=" + artprice + ", available=" + available
				+ "]";
	}
	
}
