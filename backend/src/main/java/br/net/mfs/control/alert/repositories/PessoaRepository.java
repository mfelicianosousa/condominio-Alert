package br.net.mfs.control.alert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.control.alert.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
