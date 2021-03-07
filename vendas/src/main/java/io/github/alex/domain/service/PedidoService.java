package io.github.alex.domain.service;

import io.github.alex.api.dto.PedidoDTO;
import io.github.alex.domain.entity.Pedido;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);
}
