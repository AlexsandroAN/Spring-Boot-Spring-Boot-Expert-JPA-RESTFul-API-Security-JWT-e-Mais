package io.github.alex.domain.service.impl;

import io.github.alex.domain.repository.Pedidos;
import io.github.alex.domain.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}