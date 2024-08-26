/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.model.Alm;
import com.hendisantika.adminlte.model.Art;
import com.hendisantika.adminlte.model.Venta;
import com.hendisantika.adminlte.repository.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author adminit
 */
@Controller
@RequestMapping("art")
public class ArtController {

    @Autowired
    ArtRepository artRepository;

    @GetMapping
    public String index() {
        return "redirect:/art/1";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, 5, Sort.Direction.ASC, "articulo");
        Page<Art> page = artRepository.findAll(pageRequest);
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        return "art/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("art", new Art());
        return "art/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        //almRepository.delete(id);
        return "redirect:/art";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {

        model.addAttribute("art", artRepository.findById(id));
        return "art/form";

    }

    @PostMapping(value = "/save")
    public String save(Art art, final RedirectAttributes ra) {

        Art save = artRepository.save(art);
        ra.addFlashAttribute("successFlash", "Articulo creado exitosamente");
        return "redirect:/art";

    }
}
