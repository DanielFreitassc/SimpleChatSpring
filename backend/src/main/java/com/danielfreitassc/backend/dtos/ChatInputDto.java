package com.danielfreitassc.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record ChatInputDto(
    @NotBlank(message="Nome não pode estar vazio")
    String user,
    @NotBlank(message="Mensagem não pode estar vazia")
    String message
) {
    
}
