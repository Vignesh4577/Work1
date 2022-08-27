package com.nccapp.util;

public class DBQueries {

	public static final String INSERTQUERY = "INSERT INTO NCC(cadet_name, designation,division,duration) values(?,?,?,?)";
	public static final String UPDATEQUERY = "UPDATE NCC SET cadet_name=? WHERE cadet_id=?";
	public static final String DELETEQUERY = "DELETE FROM NCC WHERE cadet_id=?";
	

	public static final String SELECTQUERY = "SELECT * FROM NCC";
	public static final String SELECTBYNAME= "SELECT * FROM NCC WHERE cadet_name=?";
	public static final String SELECTBYDESIGNATION = "SELECT * FROM NCC WHERE designation=?";
	public static final String SELECTBYDIVISION = "SELECT * FROM NCC WHERE division=?";
	public static final String SELECTBYID = "SELECT * FROM NCC WHERE cadet_id=?";
	public static final String SELECTBYDURATION = "SELECT * FROM NCC WHERE duration=?";
	
}
