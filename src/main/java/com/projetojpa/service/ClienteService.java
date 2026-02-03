package com.projetojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojpa.entity.Cliente;
import com.projetojpa.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	// Salvar cliente
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	// Buscar cliente por ID
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	// Listar todos os clientes
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}

	// Deletar cliente
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
