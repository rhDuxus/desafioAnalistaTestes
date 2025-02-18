package br.com.duxus.testepratico.cypress.repository;

import br.com.duxus.testepratico.cypress.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author carlosau
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}