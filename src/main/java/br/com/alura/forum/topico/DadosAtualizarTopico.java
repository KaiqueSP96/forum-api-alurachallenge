package br.com.alura.forum.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem) {}

