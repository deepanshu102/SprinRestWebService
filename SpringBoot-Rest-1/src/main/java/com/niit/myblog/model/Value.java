
package com.niit.myblog.model;

public class Value {

	
	private Long id;
	private String quote;
	@Override
	public String toString() {
		return "Value [id=" + id + ", quote=" + quote + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public Value() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	
}
