package br.com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.model.Cliente;
import br.com.api.repository.ClienteRepository;

@Service("ClienteService")
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente envia(Cliente cliente) {
		if(cliente.getRisco() == "B") {
			cliente.setJuros(Cliente.RISCO_B);
		}
		
		else if(cliente.getRisco() == "C") {
			cliente.setJuros(Cliente.RISCO_C);
		}
		else {
			cliente.setRisco("Sem Juros adicionais !");
		}
		
		return clienteRepository.saveAndFlush(cliente);
	}
}
