package com.beeru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beeru.model.Vaccine;
import com.beeru.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {

	@Autowired
	private IVaccineRepo repo;
	@Override
	public String registerVaccineInfo(Vaccine vaccine) {
		Vaccine vac = repo.save(vaccine);
		return "vaccine info is saved in database with id "+vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		
		return repo.saveAll(vaccines);
	}

}
