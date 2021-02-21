package io.github.alex.domain.repository;

import io.github.alex.domain.entity.Cliente;
import io.github.alex.domain.entity.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alex
 */
public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
