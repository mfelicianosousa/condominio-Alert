package br.net.mfs.control.alert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.control.alert.entities.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
