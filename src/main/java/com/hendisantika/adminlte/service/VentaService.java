/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hendisantika.adminlte.service;

import com.hendisantika.adminlte.model.Venta;
import com.hendisantika.adminlte.repository.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author adminit
 */
@Service
public class VentaService extends AbstractService<Venta, Integer> {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    protected JpaRepository<Venta, Integer> getRepository() {
        return ventaRepository;
    }

}
