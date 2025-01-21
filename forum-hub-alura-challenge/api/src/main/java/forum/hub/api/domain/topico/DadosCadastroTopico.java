package forum.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopico(
                                    @NotBlank
                                    String tituloDoComentario,
                                    @NotBlank
                                    String mensagem,
                                    @NotBlank
                                    String autor,
                                    @NotBlank
                                    String curso) {
}
