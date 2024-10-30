package com.diegoferreira.unitario.Dtos;

import com.diegoferreira.unitario.entidade.AutomovelVO;

public record AutomovelRequestDto(String nome, String marca, Integer anoFabricacao) {

    public static AutomovelVO toAutomovelVO(AutomovelRequestDto automovel) {
        return new AutomovelVO(null, automovel.nome, automovel.marca, automovel.anoFabricacao);
    }

    public static AutomovelResponseDto toAutomovelRequest(AutomovelVO automovel) {
        return new AutomovelResponseDto(automovel.getId(), automovel.getNome(), automovel.getMarca(), automovel.getAnoFabricacao());
    }
    
}
