package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.model.Alm;
import com.hendisantika.adminlte.model.Venta;
import com.hendisantika.adminlte.repository.AlmRepository;
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

@Controller
@RequestMapping("alm")
public class AlmController {

    @Autowired
    AlmRepository almRepository;

    @GetMapping
    public String index() {
        return "redirect:/alm/1";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, 5, Sort.Direction.ASC, "id");
        Page<Alm> page = almRepository.findAll(pageRequest);
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        return "alm/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("venta", new Venta());
        return "alm/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        //almRepository.delete(id);
        return "redirect:/venta";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {

        model.addAttribute("venta", almRepository.findById(id));
        return "alm/form";

    }

    @PostMapping(value = "/save")
    public String save(Alm alm, final RedirectAttributes ra) {

        Alm save = almRepository.save(alm);
        ra.addFlashAttribute("successFlash", "Almacen creado exitosamente");
        return "redirect:/alm";

    }

}