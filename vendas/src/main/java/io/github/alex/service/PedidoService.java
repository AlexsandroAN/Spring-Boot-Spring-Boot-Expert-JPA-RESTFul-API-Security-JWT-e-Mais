package io.github.alex.service;

import io.github.alex.api.dto.PedidoDTO;
import io.github.alex.domain.entity.Pedido;
import io.github.alex.domain.enums.StatusPedido;
import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
