package com.example.bazar.service;

import com.example.bazar.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    //traer a todos los clientes
    public List<Cliente> getClientes();
    
    //traer un cliente mediante su id
    public Cliente getCliente(Long id);
    
    //guardar un cliente
    public void saveCliente(Cliente cliente);
    
    //baja de cliente mediante su id
    public void deleteCliente(Long id);
    
    //modificación de cliente mediante su id
    public void editCliente(Cliente cliente);
    
    
}
