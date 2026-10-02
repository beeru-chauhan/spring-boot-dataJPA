package com.beeru;

import com.beeru.model.Vaccine;
import com.beeru.service.IVaccineService;
import com.beeru.service.VaccineService;
import com.sun.tools.javac.util.List;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApp1Application {

	private final VaccineService vaccineService;

	SpringJdbcApp1Application(VaccineService vaccineService) {
		this.vaccineService = vaccineService;
	}

	public static void main(String[] args) {
		//ioc container
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApp1Application.class, args);
		IVaccineService service = container.getBean(IVaccineService.class);
		String status = service.registerVaccineInfo(new Vaccine("covaccine","BharetBio",1212));
		 System.out.println(status);
		 List<Vaccine>vaccines=ArrayList<>();
		 vaccines.add
	}

}
