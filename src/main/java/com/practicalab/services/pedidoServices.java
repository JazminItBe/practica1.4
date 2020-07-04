package com.practicalab.services;

import com.practicalab.models.pedido;
import com.practicalab.models.usuario;
import com.practicalab.repository.CRUDpedido;
import com.practicalab.repository.CRUDusuario;
import com.practicalab.repository.pedidoRepository;
import com.practicalab.repository.usuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class pedidoServices  extends CRUDpedido<pedido, pedidoRepository> {

    public pedidoServices(pedidoRepository repository) {
        super(repository);
    }
    @Override
    public List<pedido> List() {
        return null;
    }

    @Override
    public pedido get(int id) {
        return null;
    }

    @Override
    public void add(pedido o) {

    }

    @Override
    public void update(pedido o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
