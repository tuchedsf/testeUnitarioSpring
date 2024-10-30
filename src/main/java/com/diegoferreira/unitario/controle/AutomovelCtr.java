package com.diegoferreira.unitario.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.diegoferreira.unitario.Dtos.AutomovelRequestDto;
import com.diegoferreira.unitario.Dtos.AutomovelResponseDto;
import com.diegoferreira.unitario.negocio.AutomovelRN;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/automovel")
public class AutomovelCtr {

    @Autowired
    private AutomovelRN automovelService;

    @GetMapping  
    public ResponseEntity<List<AutomovelResponseDto>> retornaTodosAutomoveis() {
        return ResponseEntity.ok(automovelService.retornaTodosAutomoveis());
    }

    @PostMapping
    public ResponseEntity<AutomovelResponseDto> salvar(@RequestBody AutomovelRequestDto automovel) throws Exception {
        AutomovelResponseDto response = automovelService.salvar(automovel);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(response.id())
                        .toUri())
                .body(response);
    }
    
}
