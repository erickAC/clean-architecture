package br.com.clean.modules.client.controller;

import java.net.URI;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.clean.modules.client.domain.Client;
import br.com.clean.modules.client.dto.ClientDTO;
import br.com.clean.modules.client.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<?> list() {
		return ResponseEntity.ok().body(service.list());
	}

	@GetMapping("{id}")
	public ResponseEntity<?> listById(UUID id) {
		return ResponseEntity.ok().body(service.listById(id));
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody ClientDTO dto) {
		Client newClient = service.create(dto.toObj());
		URI uri = UriComponentsBuilder.newInstance().build("/{id}", dto.toObj().getId());
		return ResponseEntity.created(uri).body(newClient);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Client client) {
		return ResponseEntity.ok().body(service.update(client));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable UUID id) {
		return ResponseEntity.ok().body("Deletado com sucesso");
	}
}
	