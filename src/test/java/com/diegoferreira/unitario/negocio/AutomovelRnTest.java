package com.diegoferreira.unitario.negocio;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.diegoferreira.unitario.infraestrutura.AutomovelRepository;

@ExtendWith(MockitoExtension.class)
public class AutomovelRnTest {

    @InjectMocks
    private AutomovelRN automovelService;

    @Mock
    private AutomovelRepository automovelRepository;





    
}
