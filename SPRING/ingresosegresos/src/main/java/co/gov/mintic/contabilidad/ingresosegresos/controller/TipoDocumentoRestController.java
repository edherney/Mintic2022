package co.gov.mintic.contabilidad.ingresosegresos.controller;

import co.gov.mintic.contabilidad.ingresosegresos.entity.Rol;
import co.gov.mintic.contabilidad.ingresosegresos.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @RequestMapping("/TipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable long id){
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(id);
        tipoDocumento.setDescripcion("Cedula de Ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;

    }

    @GetMapping("/TipoDocumento")
    public List<TipoDocumento> findAll(){
        List<TipoDocumento> tipoDocumentos = new ArrayList<TipoDocumento>();
        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setIdTipoDocumento(1);
        tipoDocumento1.setDescripcion("Cedula de Ciudadania");
        tipoDocumento1.setSiglas("CC");
        tipoDocumento1.setEstado(true);
        tipoDocumentos.add(tipoDocumento1);

        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(2);
        tipoDocumento2.setDescripcion("Tarjeta de Identidad");
        tipoDocumento2.setSiglas("TI");
        tipoDocumento2.setEstado(true);
        tipoDocumentos.add(tipoDocumento2);

        return tipoDocumentos;
    }

    @PostMapping("/TipoDocumento")
    public TipoDocumento createTipoDocumento(@RequestBody TipoDocumento tipoDocumento) {
        TipoDocumento newtipoDocumento1 = new TipoDocumento();
        newtipoDocumento1.setIdTipoDocumento(1);
        newtipoDocumento1.setDescripcion(tipoDocumento.getDescripcion());
        newtipoDocumento1.setEstado(tipoDocumento.isEstado());
        return newtipoDocumento1;

    }

    @PutMapping("/TipoDocumento/{id}")
    public TipoDocumento updateTipoDocumento(@PathVariable int id, @RequestBody TipoDocumento tipoDocumento){
        TipoDocumento putTipoDocumento = findById(id);
        putTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        putTipoDocumento.setEstado(tipoDocumento.isEstado());
        return putTipoDocumento;
    }

    @DeleteMapping("/TipoDocumento/{id}")
    public void deleteTipoDocumento(@PathVariable int id){
        TipoDocumento putTipoDocumento = findById(id);
    }

}
