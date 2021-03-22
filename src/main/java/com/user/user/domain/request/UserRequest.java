package com.user.user.domain.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserRequest {
	@NotNull(message = "Email não pode ser nulo")
	@Email(message = "Email não é válido")
	private String email;
	
	@NotBlank(message = "Senha não pode está em branco")
	@NotNull(message = "Senha não pode ser nula")
	private String senha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
