package br.com.clean.modules.client.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clean.modules.client.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID>{

}
