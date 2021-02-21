package io.github.alex.domain.repository;

import io.github.alex.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alex
 */
public interface Produtos extends JpaRepository<Produto, Integer> {

}
