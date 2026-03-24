package com.gal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Supplier")
public class Supplier {

    @Id
    private int sid;

    private String sname;
    private double srank;
    private String city;

    public Supplier(int i, String string, double d, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSrank() {
        return srank;
    }

    public void setSrank(double srank) {
        this.srank = srank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}