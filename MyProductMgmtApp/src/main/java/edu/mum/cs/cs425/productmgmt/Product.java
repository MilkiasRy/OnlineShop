package edu.mum.cs.cs425.productmgmt;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {

private long pid;
private long productNumber;
private String name;
private float unitPrice;
private LocalDate dateMfd;

public Product() {
	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public long getProductNumber() {
	return productNumber;
}
public void setProductNumber(long productNumber) {
	this.productNumber = productNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(float unitPrice) {
	this.unitPrice = unitPrice;
}
public LocalDate getDateMfd() {
	return dateMfd;
}
public void setDateMfd(LocalDate dateMfd) {
	this.dateMfd = dateMfd;
}


}
