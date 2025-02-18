package br.com.duxus.testepratico.cypress.repository;

import br.com.duxus.testepratico.cypress.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author carlosau
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByEmail(String email);
}