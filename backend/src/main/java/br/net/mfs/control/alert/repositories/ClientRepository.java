package br.net.mfs.control.alert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.mfs.control.alert.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
