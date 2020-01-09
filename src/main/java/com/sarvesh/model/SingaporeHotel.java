package com.sarvesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SingaporeHotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String host_name;
	private String neighbourhood_group;
	private String neighbourhood;
	private double latitude;
	private double longitude;
	private String room_type;
	private int price;
	public SingaporeHotel(String name, String host_name, String neighbourhood_group, String neighbourhood,
			double latitude, double longitude, String room_type, int price) {
		super();
		this.name = name;
		this.host_name = host_name;
		this.neighbourhood_group = neighbourhood_group;
		this.neighbourhood = neighbourhood;
		this.latitude = latitude;
		this.longitude = longitude;
		this.room_type = room_type;
		this.price = price;
	}
	public SingaporeHotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getNeighbourhood_group() {
		return neighbourhood_group;
	}
	public void setNeighbourhood_group(String neighbourhood_group) {
		this.neighbourhood_group = neighbourhood_group;
	}
	public String getNeighbourhood() {
		return neighbourhood;
	}
	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	 
	
	
	
	
	

}
