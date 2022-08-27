package com.nccapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nccapp.bean.Ncc;
import com.nccapp.util.DBQueries;

@Repository
public class NccRepositoryImpl implements INccRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Ncc> findAll() {

		return showAll();
	}

	@Override
	public void addNcc(Ncc ncc) {
		Object[] nccArray = { ncc.getCadetName(),  ncc.getDesignation(), ncc.getDivision(),
				ncc.getDuration() };
		jdbcTemplate.update(DBQueries.INSERTQUERY, nccArray);

	}

	@Override
	public void updateNcc(String cadet_name, int cadet_id) {
		String sql = DBQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,cadet_name,cadet_id);

	}

	@Override
	public void deleteNcc(int cadet_id) {
		String sql = DBQueries.DELETEQUERY;
		jdbcTemplate.update(sql,cadet_id);

	}

	public List<Ncc> findByName(String cadetName) {

		List<Ncc> ncc = jdbcTemplate.query(DBQueries.SELECTBYNAME, new RowMapper<Ncc>() {

			@Override
			public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {

				Ncc ncc = new Ncc();
				ncc.setCadetName(rs.getString("cadet_name"));
				ncc.setDesignation(rs.getString("designation"));
				ncc.setCadetId(rs.getInt("cadet_id"));
				ncc.setDivision(rs.getString("division"));
				ncc.setDuration(rs.getInt("duration"));

				int cadetId = rs.getInt("cadet_id");
				ncc.setCadetId(cadetId);
				return ncc;
			}

		}, cadetName);
		return ncc;

	}

	public List<Ncc> findByDesignation(String designation) {

		List<Ncc> ncc = jdbcTemplate.query(com.nccapp.util.DBQueries.SELECTBYDESIGNATION, new RowMapper<Ncc>() {

			@Override
			public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {

				Ncc ncc = new Ncc();
				ncc.setCadetName(rs.getString("cadet_name"));
				ncc.setDesignation(rs.getString("designation"));
				ncc.setCadetId(rs.getInt("cadet_id"));
				ncc.setDivision(rs.getString("division"));
				ncc.setDuration(rs.getInt("duration"));

				int cadetId = rs.getInt("cadet_id");
				ncc.setCadetId(cadetId);
				return ncc;
			}

		}, designation);
		return ncc;
	}

	public List<Ncc> findByDivision(String division) {
		List<Ncc> ncc = jdbcTemplate.query(com.nccapp.util.DBQueries.SELECTBYDIVISION, new RowMapper<Ncc>() {

			@Override
			public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {

				Ncc ncc = new Ncc();
				ncc.setCadetName(rs.getString("cadet_name"));
				ncc.setDesignation(rs.getString("designation"));
				ncc.setCadetId(rs.getInt("cadet_id"));
				ncc.setDivision(rs.getString("division"));
				ncc.setDuration(rs.getInt("duration"));

				int cadetId = rs.getInt("cadet_id");
				ncc.setCadetId(cadetId);
				return ncc;
			}

		}, division);
		return ncc;

	}

	public Ncc findBycadetId(int cadetId) {
		return jdbcTemplate.queryForObject(DBQueries.SELECTBYID, (rs, rowNum) -> {

			Ncc ncc = new Ncc();
			ncc.setCadetName(rs.getString("cadet_name"));
			ncc.setDesignation(rs.getString("designation"));
			ncc.setCadetId(rs.getInt("cadet_id"));
			ncc.setDivision(rs.getString("division"));
			ncc.setDuration(rs.getInt("duration"));

			int Id = rs.getInt("cadet_id");
			ncc.setCadetId(cadetId);
			return ncc;

		}, cadetId);

	}

	public Ncc findByDuration(int duration) {
		return jdbcTemplate.queryForObject(DBQueries.SELECTBYDURATION, (rs, rowNum) -> {

			Ncc ncc = new Ncc();
			ncc.setCadetName(rs.getString("cadet_name"));
			ncc.setDesignation(rs.getString("designation"));
			ncc.setCadetId(rs.getInt("cadet_id"));
			ncc.setDivision(rs.getString("division"));
			ncc.setDuration(rs.getInt("duration"));

			int cadetId = rs.getInt("cadet_id");
			ncc.setCadetId(cadetId);
			return ncc;

		}, duration);

	}

	private List<Ncc> showAll() {

		List<Ncc> ncc = Arrays.asList(new Ncc("cadet Basavaraj", "major", "Junior", 2),
				new Ncc("cadet bharath", "captain", "Senior", 3),
				new Ncc("cadet Vignesh", "minor", "Senior", 2),
				new Ncc("cadet jack", "major", "Junior", 2), 
				new Ncc("cadet Rakesh", "captain", "Senior", 3),
				new Ncc("cadet Manjunath", "soldier", "Junior", 4));
		return ncc;

	}

}
