package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IngresoRestController {
    @GetMapping("/Ingreso/{id}")
    public Ingreso findById(@PathVariable long id){
        Ingreso entradaUno = new Ingreso(41, TipoMovimiento.INGRESO, new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),90,new Date(),450000,"pago pedido");
        return entradaUno;
    }

    @GetMapping("/Ingreso")
    public List<Ingreso> findAll(){
        List<Ingreso> nuevoIng = new ArrayList<Ingreso>();
        Ingreso ingresoUno = new Ingreso(41, TipoMovimiento.INGRESO, new Usuario(1,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752341223","Carlos","perez","popayan",603134567,"cperez@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),90,new Date(),450000,"pago pedido");
        nuevoIng.add(ingresoUno);
        Ingreso ingresoDos = new Ingreso(39, TipoMovimiento.INGRESO, new Usuario(2,new TipoDocumento(001,"Cedula Ciudadania","CC",true),"10752340023","guillermo","oliveros","santa marta",603134060,"guillermo@hotmail.com",new Rol(0001,"Operario",true),"1q2w3e4r5t",true),91,new Date(),400500,"pago pedido");
        nuevoIng.add(ingresoDos);
        return nuevoIng;
    }

}
