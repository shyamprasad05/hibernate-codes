package org.jpa.onetoone_Bi_directional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name,place;
	private long phone;
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "pancard_id")
	private Pancard pan;
	public int getId() {
		return id;
	}
	public Pancard getPan() {
		return pan;
	}
	public void setPan(Pancard pan) {
		this.pan = pan;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}
