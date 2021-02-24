package br.net.mfs.control.alert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.mfs.control.alert.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
