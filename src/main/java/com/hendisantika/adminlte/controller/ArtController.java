/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.model.Alm;
import com.hendisantika.adminlte.model.Art;
import com.hendisantika.adminlte.repository.ArtRepository;
import com.hendisantika.adminlte.repository.ArtfamiliaRepository;
import com.hendisantika.adminlte.service.ArtService;
import com.hendisantika.adminlte.service.ArtcategoriaService;
import com.hendisantika.adminlte.service.ArtfabricanteService;
import com.hendisantika.adminlte.service.ArtfamiliaService;
import com.hendisantika.adminlte.service.ArtgrupoService;
import com.hendisantika.adminlte.service.ArtlineaService;
import com.hendisantika.adminlte.service.UnidadService;

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

/**
 *
 * @author adminit
 */
@Controller
@RequestMapping("art")
public class ArtController {

    @Autowired
    ArtRepository artRepository;

    @Autowired
    ArtService artService;

    @Autowired
    ArtfamiliaRepository artfamiliaRepository;

    @Autowired
    ArtfabricanteService artfabricanteService;

    @Autowired
    UnidadService unidadService;

    @Autowired
    ArtcategoriaService artcategoriaService;

    @Autowired
    ArtfamiliaService artfamiliaService;

    @Autowired
    ArtlineaService artlineaService;

    @Autowired
    ArtgrupoService artgrupoService;

    @GetMapping
    public String index() {
        return "redirect:/art/1";
    }

    public String action = "Add";

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
        model.addAttribute("familias", artfamiliaRepository.findAll());
        model.addAttribute("fabricantes", artfabricanteService.findAll());
        model.addAttribute("unidades", unidadService.findAllUnidad());
        model.addAttribute("cboartcategoria", artcategoriaService.findAllArtCategoria());
        model.addAttribute("cboArtfabricante", artfabricanteService.findAll());
        model.addAttribute("cboArtfamilia", artfamiliaService.findAllArtfamilias());
        model.addAttribute("cboArtlinea", artlineaService.findAll());
        model.addAttribute("cboArtgrupo", artgrupoService.findAll());
        model.addAttribute("art", new Art());
        return "art/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        // almRepository.delete(id);
        return "redirect:/art";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        action = "Edit";
        model.addAttribute("familias", artfamiliaRepository.findAll());
        model.addAttribute("fabricantes", artfabricanteService.findAll());
        model.addAttribute("unidades", unidadService.findAllUnidad());
        model.addAttribute("cboartcategoria", artcategoriaService.findAllArtCategoria());
        model.addAttribute("cboArtfabricante", artfabricanteService.findAll());
        model.addAttribute("cboArtfamilia", artfamiliaService.findAllArtfamilias());
        model.addAttribute("cboArtlinea", artlineaService.findAll());
        model.addAttribute("cboArtgrupo", artgrupoService.findAll());
        model.addAttribute("art", artRepository.findById(id));
        return "art/form";

    }

    @PostMapping(value = "/save")
    public String save(Art art, final RedirectAttributes ra) {

        Art save = artRepository.save(art);
        ra.addFlashAttribute("successFlash",
                "Articulo " + (action.equals("Edit") ? "Actualizado" : "Creado") + " exitosamente");
        return "redirect:/art/edit/" + save.getArticulo();

    }

    @PostMapping("/data")
    @ResponseBody
    public com.hendisantika.adminlte.datatable.Page<Art> getPaginatedDatatable(
            @RequestBody PagingRequest pagingRequest, Model model) {

        return artService.getPaginatedDatatable(pagingRequest);
    }

}
