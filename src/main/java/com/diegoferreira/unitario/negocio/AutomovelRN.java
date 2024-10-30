package com.diegoferreira.unitario.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegoferreira.unitario.Dtos.AutomovelRequestDto;
import com.diegoferreira.unitario.Dtos.AutomovelResponseDto;
import com.diegoferreira.unitario.entidade.AutomovelVO;
import com.diegoferreira.unitario.infraestrutura.AutomovelRepository;

@Service
public class AutomovelRN {

    @Autowired
    private AutomovelRepository automovelRepository;

    public List<AutomovelResponseDto> retornaTodosAutomoveis() {
        return AutomovelResponseDto.toAutomovelResponse(automovelRepository.findAll());
    }

    public AutomovelResponseDto buscarPorId(Long id) {
        return AutomovelResponseDto.toAutomovelResponse(automovelRepository.findById(id).orElseThrow());
    }

    public AutomovelResponseDto salvar(AutomovelRequestDto automovelRequest) throws Exception {

        if (automovelRequest.anoFabricacao() < 2004) {
            throw new Exception("Não é permitido o cadastro de carros que não pagam IPVA! Mais de 20 anos de uso!");
        }

        if (automovelRequest.marca().contains("BYD")) {
            throw new Exception("Eletricos não são permitidos!");
        }

        AutomovelVO entity = automovelRepository.save(AutomovelRequestDto.toAutomovelVO(automovelRequest));
        return AutomovelRequestDto.toAutomovelRequest(entity);

    }
}
