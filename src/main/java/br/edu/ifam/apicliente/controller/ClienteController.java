package br.edu.ifam.apicliente.controller;

import java.util.List;

import javax.validation.Valid;

import br.edu.ifam.apicliente.dto.ResponseDto;
import br.edu.ifam.apicliente.dto.ClienteDto;
import br.edu.ifam.apicliente.entity.Cliente;
import br.edu.ifam.apicliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @PostMapping // http://localhost:8080/cliente/
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseDto saveCliente(@Valid @RequestBody Cliente cliente) {
    return clienteService.saveCliente(cliente);
  }

  @GetMapping(value = "/list") // http://localhost:8080/cliente/list
  public List<ClienteDto> getAllCliente() {
    return clienteService.getAllClienteOrderByName();
  }

  @GetMapping(value = "/{id}")
  public ClienteDto getClienteById(@Valid @PathVariable Long id) {
    return clienteService.getClienteById(id);
  }

  @PutMapping
  public ResponseDto updateCliente(@Valid @RequestBody Cliente cliente) {
    return clienteService.updateCliente(cliente);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseDto deleteCliente(@Valid @PathVariable Long id) {
    return clienteService.deleteCliente(id);
  }

}