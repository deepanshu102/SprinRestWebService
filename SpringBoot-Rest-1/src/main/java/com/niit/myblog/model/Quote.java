package com.niit.myblog.model;

public class Quote {
	private String type;
	private Value value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Quote [type=" + type + ", value=" + value + "]";
	}
	public Quote(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}
	public Quote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
