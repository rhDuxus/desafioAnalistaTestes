package br.com.duxus.testepratico.cypress.controller;

import br.com.duxus.testepratico.cypress.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author carlosau
 */
@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "dashboard";
    }

    @GetMapping("/items")
    public String showItems(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "items";
    }
}