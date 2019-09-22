package com.company.xdevcon1.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "film")
public class Film {

	private String title;
	private int year;

	public Film() {
		super();

	}

	public Film(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Film [title=" + title + ", year=" + year + "]";
	}

}
