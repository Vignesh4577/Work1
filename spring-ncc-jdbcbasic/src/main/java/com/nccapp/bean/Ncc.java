package com.nccapp.bean;

public class Ncc {

	private String cadetName;
	private String designation;
	private String division;
	private int cadetId;
	private int duration;

	public Ncc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ncc(String cadetName, String designation, String division, Integer duration) {
		super();
		this.cadetName = cadetName;
		this.designation = designation;
		this.division = division;
		this.duration = duration;
	}

	public String getCadetName() {
		return cadetName;
	}

	public void setCadetName(String cadetName) {
		this.cadetName = cadetName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Integer getCadetId() {
		return cadetId;
	}

	public void setCadetId(int cadetId) {
		this.cadetId = cadetId;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Ncc [cadetName=" + cadetName + ", designation=" + designation + ", division=" + division + ", cadetId="
				+ cadetId + ", duration=" + duration + "]";
	}

}
