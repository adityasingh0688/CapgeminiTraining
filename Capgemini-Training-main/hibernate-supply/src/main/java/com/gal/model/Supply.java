package com.gal.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="Supply")
public class Supply {

    @Id
    private int billno;

    @ManyToOne
    @JoinColumn(name="Sid")
    private Supplier sid;
   
	
	public Supply(int i, Supplier s1, Item i2, java.sql.Date valueOf, double d, int j) {
		// TODO Auto-generated constructor stub
	}
	public Supplier getSid() {
		return sid;
	}
	public void setSid(Supplier sid) {
		this.sid = sid;
	}
	@ManyToOne
    @JoinColumn(name="itemid")
    private Item item;

    private Date datesupply;
    private double price;
    private int qty;

    public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	 

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Date getDatesupply() {
		return datesupply;
	}
	public void setDatesupply(Date datesupply) {
		this.datesupply = datesupply;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}