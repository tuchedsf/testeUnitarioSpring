package com.diegoferreira.unitario.infraestrutura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegoferreira.unitario.entidade.AutomovelVO;

@Repository
public interface AutomovelRepository extends JpaRepository<AutomovelVO, Long> {
    
}
