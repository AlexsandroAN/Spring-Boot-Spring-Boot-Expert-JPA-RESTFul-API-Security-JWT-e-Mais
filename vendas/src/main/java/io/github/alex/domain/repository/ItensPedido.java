package io.github.alex.domain.repository;

import io.github.alex.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alex
 */
public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
  

}