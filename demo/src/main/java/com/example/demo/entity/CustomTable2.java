package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the custom_table2 database table.
 * 
 */
@Entity
@Table(name="custom_table2")
@NamedQuery(name="CustomTable2.findAll", query="SELECT c FROM CustomTable2 c")
public class CustomTable2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomTable2PK id;

	@Column(name="data_int")
	private int dataInt;

	@Column(name="data_string")
	private String dataString;

	public CustomTable2() {
	}

	public CustomTable2PK getId() {
		return this.id;
	}

	public void setId(CustomTable2PK id) {
		this.id = id;
	}

	public int getDataInt() {
		return this.dataInt;
	}

	public void setDataInt(int dataInt) {
		this.dataInt = dataInt;
	}

	public String getDataString() {
		return this.dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}

	public CustomTable2(CustomTable2PK id, int dataInt, String dataString) {
		super();
		this.id = id;
		this.dataInt = dataInt;
		this.dataString = dataString;
	}

	@Override
	public String toString() {
		return "CustomTable2 [id=" + id + ", dataInt=" + dataInt + ", dataString=" + dataString + "]";
	}

}