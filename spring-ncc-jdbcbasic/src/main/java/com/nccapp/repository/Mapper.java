package com.nccapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nccapp.bean.Ncc;

public class Mapper implements RowMapper<Ncc> {

	@Override
	public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {
		String planName = rs.getString("plan_name");
		String designation = rs.getString("designation");
		String division = rs.getString("division");
		int cadetId = rs.getInt("cadet_id");
		int duration = rs.getInt("duration");
		
		Ncc ncc = new Ncc();
		ncc.setCadetName(planName);;
		ncc.setDesignation(designation);
		ncc.setDivision(division);
		ncc.setCadetId(1);
		ncc.setDuration(2);

		return ncc;
	}

}
