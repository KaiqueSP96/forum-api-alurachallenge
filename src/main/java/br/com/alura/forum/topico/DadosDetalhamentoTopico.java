package br.com.alura.forum.topico;

public record DadosDetalhamentoTopico(

    Long id,
    String titulo,
    String mensagem,
    String data_criacao,
    String status,
    String autor,
    String curso

) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData_criacao(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }

}
