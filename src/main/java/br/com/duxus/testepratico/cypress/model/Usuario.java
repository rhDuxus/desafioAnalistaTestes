package br.com.duxus.testepratico.cypress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author carlosau
 */
@Entity
public class Usuario {

    @Id
    private String email;

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
