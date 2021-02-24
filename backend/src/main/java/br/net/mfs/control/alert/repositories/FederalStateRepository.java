package br.net.mfs.control.alert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.control.alert.entities.FederalState;

public interface FederalStateRepository extends JpaRepository<FederalState, String> {

}
