package br.com.duxus.testepratico.cypress.controller;

import br.com.duxus.testepratico.cypress.model.Usuario;
import br.com.duxus.testepratico.cypress.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author carlosau
 */
@Controller
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Usuario usuario) {
        Usuario existingUsuario = usuarioRepository.findByEmail(usuario.getEmail());
        if (existingUsuario != null && existingUsuario.getPassword().equals(usuario.getPassword())) {
            return "redirect:/dashboard";
        } else {
            return "login";
        }
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }
}
