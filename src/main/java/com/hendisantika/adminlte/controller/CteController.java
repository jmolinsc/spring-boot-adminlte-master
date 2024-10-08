package com.hendisantika.adminlte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.model.Alm;
import com.hendisantika.adminlte.model.Cte;
import com.hendisantika.adminlte.repository.CteRepository;
import com.hendisantika.adminlte.service.CteService;

@Controller
@RequestMapping("cte")
public class CteController {

    @Autowired
    CteService cteService;

    @Autowired
    CteRepository cteRepository;

    public String action = "Add";

    @GetMapping
    public String index() {
        // return "redirect:/cte";
        return "cte/list";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {

        PageRequest pageRequest = PageRequest.of(pageNumber - 1, 5, Sort.Direction.ASC, "cliente");
        Page<Cte> page = cteRepository.findAll(pageRequest);
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);

        return "cte/list";

    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("cte", new Cte());
        return "cte/form";
    }

    @GetMapping("/edit/{cliente}")
    public String edit(@PathVariable String cliente, Model model) {
        model.addAttribute("cte", cteService.findById(cliente));
        return "cte/form";
    }

    @PostMapping(value = "/save")
    public String save(Cte cte, final RedirectAttributes ra) {
        Cte save = cteService.save(cte);
        ra.addFlashAttribute("successFlash", "Cliente creado exitosamente.");
        return "redirect:/cte/edit/" + save.getCliente();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        // cteService.delete(id);
        return "redirect:/cte";

    }

    @PostMapping("/data")
    @ResponseBody
    public com.hendisantika.adminlte.datatable.Page<Cte> getPaginatedDatatable(
            @RequestBody PagingRequest pagingRequest, Model model) {

        return cteService.getPaginatedDatatable(pagingRequest);
    }
}
