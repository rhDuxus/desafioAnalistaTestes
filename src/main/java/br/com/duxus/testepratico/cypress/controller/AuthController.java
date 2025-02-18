package br.com.duxus.testepratico.cypress.controller;

import br.com.duxus.testepratico.cypress.model.Usuario;
import br.com.duxus.testepratico.cypress.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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

    @GetMapping({"/"})
    public String redirectLogin() {
        return "redirect:/login";
    }

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
    public String register(@ModelAttribute Usuario usuario, String confirmarSenha, Model model) {
        // Validação de confirmação de senha
        if (!StringUtils.hasText(usuario.getPassword()) || !StringUtils.hasText(confirmarSenha)) {
            model.addAttribute("error", "As senhas não foram informadas. Tente novamente.");
            return "register"; // Retorna para a página de registro com mensagem de erro
        }
        // Validação de confirmação de senha
        if (!usuario.getPassword().equals(confirmarSenha)) {
            model.addAttribute("error", "As senhas não coincidem. Tente novamente.");
            return "register"; // Retorna para a página de registro com mensagem de erro
        }

        // Verificando se o e-mail já existe
        if (usuarioRepository.findByEmail(usuario.getEmail()) != null) {
            model.addAttribute("error", "Este e-mail já está registrado.");
            return "register";
        }

        // Salvando o usuário
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }
}
