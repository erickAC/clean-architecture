package br.com.clean.modules.client.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clean.modules.client.contract.ServiceInterface;
import br.com.clean.modules.client.domain.Client;
import br.com.clean.modules.client.repository.ClientRepository;

@Service
public class ClientService implements ServiceInterface {

	@Autowired
	private ClientRepository repository;

	@Override
	public Client create(Object object) {
		try {
			Client client = (Client) object;
			return repository.save(client);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public Client update(Object object) {
		try {
			Client client = (Client) object;
			if (client.getId().equals(null)) {
				repository.save(client);
			}
			return client;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public List<Client> list() {
		try {
			List<Client> list = repository.findAll();
			return list;			
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public Client listById(UUID id) {
		try {
			Client client = (Client) repository.findById(id).orElse(null);
			return client != null ? client : null;			
		} catch(Exception e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public void delete(UUID id) {
		try {
			Client client = repository.findById(id).get();
			repository.delete(client);
		} catch (Exception e) {
			
		}
	}

}
