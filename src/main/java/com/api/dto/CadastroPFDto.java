package com.api.dto;

import java.util.Optional;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;

@Data
public class CadastroPFDto {

	private Long id;
	@NotEmpty(message = "Nome não pode ser vazio.")
	@Length(min = 3, max = 45, message = "Nome deve conter entre 3 e 45 caracteres.")
	private String nome;
	@NotEmpty(message = "Email não pode ser vazio.")
	@Length(min = 8, max = 75, message = "Email deve conter entre 8 e 75 caracteres.")
	@Email(message="Email inválido.")
	private String email;
	@NotEmpty(message = "Senha não pode ser vazia.")
	private String senha;
	@NotEmpty(message = "CPF não pode ser vazio.")
	@CPF(message="CPF inválido")
	private String cpf;
	private Optional<String> valorHora = Optional.empty();
	private Optional<String> quantidadeHorasTrabalhoDia = Optional.empty();
	private Optional<String> quantidadeHorasAlmoco = Optional.empty();
	@NotEmpty(message = "CNPJ não pode ser vazio.")
	@CNPJ(message = "CNPJ inválido.")
	private String cnpj;
}
