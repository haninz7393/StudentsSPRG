package com.sol.models;


public class Student {
	private int id;
	private String name;
	private String date;
	private boolean isActive;

	public Student(String name, String date, boolean isActive) {
		super();
		this.name = name;
		this.date = date;
		this.isActive = isActive;
	}
	
	public Student(int id, String name, String date, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.isActive = isActive;
	}

	public Student() {
		
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", date=");
		builder.append(date);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append("]");
		return builder.toString();
	}

}
