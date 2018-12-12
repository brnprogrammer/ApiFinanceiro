package br.com.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.model.Cliente;
import br.com.api.repository.ClienteRepository;
import br.com.api.service.ClienteService;

@RestController
public class ClienteRestController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteService clienteService;
	
	@CrossOrigin
	@GetMapping(value = "/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Cliente> listClientes(){
		return clienteRepository.findAll();
	}
	
	@CrossOrigin
	@GetMapping(value = "/envia", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> enviarMensagem() {
		Cliente cliente;
		cliente = clienteService.envia();
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
}
