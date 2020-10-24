package com.api.dto;

import java.util.Optional;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LancamentoDto {

	private Optional<Long> id = Optional.empty();
	@NotEmpty(message = "Data não pode ser vazia.")
	private String data;
	private String tipo;
	private String descricao;
	private String localizacao;
	private Long funcionarioId;
}
