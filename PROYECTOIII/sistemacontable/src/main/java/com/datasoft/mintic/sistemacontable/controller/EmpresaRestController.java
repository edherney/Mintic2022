package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Empresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {
    @GetMapping("/Empresa/{id}")
    public Empresa findById(@PathVariable long id){
        Empresa EnterpriseOne = new Empresa(1,1075212588,"ByGsistemas","cali",601234356,"bygsistemas@gmail.com");
        return EnterpriseOne;
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/Empresa")
    public List<Empresa> findAll(){
        List<Empresa> compañia = new ArrayList<Empresa>();
        Empresa emp1 = new Empresa(01,1076543234,"coopetrol","bogota",6784523,"coopetrol@yahoo.com");
        compañia.add(emp1);
        Empresa emp2 = new Empresa(02,1076524234,"ventasneiva","neiva",6712523,"ventasneiva@yahoo");
        compañia.add(emp2);
        return compañia;
    }
}
