package br.com.clean.modules.client.dto;

import br.com.clean.modules.client.domain.Client;

public class ClientDTO {

	private String nome;
	private String email;
	private String endereco;

	public Client toObj() {
		Client client = new Client();
		client.setEmail(this.getEmail());
		client.setEndereco(this.getEndereco());
		client.setNome(this.getNome());
		return client;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
