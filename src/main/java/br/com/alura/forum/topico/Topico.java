package br.com.alura.forum.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String data_criacao;
    private String status;
    private String autor;
    private String curso;

    private Boolean ativo;


    public Topico(DadosCadastroTopico topico) {

        this.ativo = true;
        this.titulo = topico.titulo();
        this.mensagem = topico.mensagem();
        this.data_criacao = topico.data_criacao();
        this.status = topico.status();
        this.autor = topico.autor();
        this.curso = topico.curso();
    }

    public void atualizarInformacoesTopico(DadosAtualizarTopico dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
};


