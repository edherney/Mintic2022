package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @GetMapping("/TipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable long id){
       TipoDocumento docUno = new TipoDocumento(1,"Cedula Ciudadania","CC",true);
       return docUno;
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/TipoDocumento")
    public List<TipoDocumento> findAll(){
        List<TipoDocumento> tiposDoc = new ArrayList<TipoDocumento>();
        TipoDocumento tDoc1 = new TipoDocumento(2,"Cedula Extranjeria","CI",true);
        tiposDoc.add(tDoc1);
        TipoDocumento tDoc2 = new TipoDocumento(3,"numero identificacion","NUIP",true);
        tiposDoc.add(tDoc2);
        return tiposDoc;
    }

}
