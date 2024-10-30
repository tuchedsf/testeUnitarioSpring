package com.diegoferreira.unitario.Dtos;

import java.util.List;

import com.diegoferreira.unitario.entidade.AutomovelVO;

public record AutomovelResponseDto(Long id, String nome, String marca, Integer anoFabricacao) {
        public static List<AutomovelResponseDto> toAutomovelResponse(List<AutomovelVO> automoveis) {
            return automoveis.stream().map(a -> new AutomovelResponseDto(a.getId(), a.getNome(), a.getMarca(), a.getAnoFabricacao())).toList();
        }
    
        public static AutomovelResponseDto toAutomovelResponse(AutomovelVO automovel) {
            return new AutomovelResponseDto(automovel.getId(), automovel.getNome(), automovel.getMarca(), automovel.getAnoFabricacao());
        }
}
