package co.gov.mintic.contabilidad.ingresosegresos.controller;

import co.gov.mintic.contabilidad.ingresosegresos.entity.TipoDocumento;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
