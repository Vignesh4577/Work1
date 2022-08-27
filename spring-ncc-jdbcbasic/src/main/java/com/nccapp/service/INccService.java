package com.nccapp.service;

import java.util.List;


import com.nccapp.bean.Ncc;

public interface INccService {

	
	void addNcc(Ncc ncc);
	void updateNcc(String cadet_name,int cadet_id);
	void deleteNcc(int cadet_id);
	
	
	List<Ncc> getAll();
	List<Ncc> getByName(String cadetName);
	List<Ncc> getByDesignation(String designation);
	List<Ncc> getByDivision(String division);
	Ncc getBycadetId(int cadetId);
	Ncc getByDuration(int duration);
}
