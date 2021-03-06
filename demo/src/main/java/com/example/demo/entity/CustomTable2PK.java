package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The primary key class for the custom_table2 database table.
 * 
 */
@Embeddable
public class CustomTable2PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="key_1")
	private String key1;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="key_2")
	private java.util.Date key2;

	public CustomTable2PK() {
	}
	public CustomTable2PK(String i, Date date) {
		this.key1 = i;
		this.key2 = date;
	}
	public String getKey1() {
		return this.key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public java.util.Date getKey2() {
		return this.key2;
	}
	public void setKey2(java.util.Date key2) {
		this.key2 = key2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomTable2PK)) {
			return false;
		}
		CustomTable2PK castOther = (CustomTable2PK)other;
		return 
			this.key1.equals(castOther.key1)
			&& this.key2.equals(castOther.key2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.key1.hashCode();
		hash = hash * prime + this.key2.hashCode();
		
		return hash;
	}
	@Override
	public String toString() {
		return "CustomTable2PK [key1=" + key1 + ", key2=" + key2 + "]";
	}
	
}