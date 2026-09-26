package com.beeru.service;

import com.beeru.model.Vaccine;

public interface IVaccineService {
String registerVaccineInfo(Vaccine vaccine);

Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine>vaccines);
}
