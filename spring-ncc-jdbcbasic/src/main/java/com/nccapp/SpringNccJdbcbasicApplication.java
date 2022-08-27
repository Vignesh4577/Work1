package com.nccapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nccapp.bean.Ncc;
import com.nccapp.service.INccService;

@SpringBootApplication
public class SpringNccJdbcbasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringNccJdbcbasicApplication.class, args);
	}

	@Autowired
	INccService iNccService;

	@Override
	public void run(String... args) throws Exception {
		Ncc ncc = new Ncc("cadet sharath", "major", "Junior", 2);
//		iNccService.addNcc(ncc);

//		iNccService.updateNcc("cadet raju", 1);
//		iNccService.deleteNcc(3);

		iNccService.getAll().forEach(System.out::println);
		iNccService.getByName("cadet raju").forEach(System.out::println);
		iNccService.getByDesignation("officer").forEach(System.out::println);
		iNccService.getByDivision("army").forEach(System.out::println);
		System.out.println(iNccService.getBycadetId(2));
		
	}

}
