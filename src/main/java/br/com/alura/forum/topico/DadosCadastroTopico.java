package br.com.alura.forum.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopico(

        String id,
        @NotBlank(message = "Titulo Obrigatório!")
        String titulo,
        @NotBlank(message = "Mensagem Obrigatória!")
        String mensagem,
        String data_criacao,
        String status,
        @NotBlank(message = "Autor Obrigatório!")
        String autor,
        @NotBlank(message = "Nome do Curso Obrigatório!")
        String curso
) { }

