package com.projetointegrador.projeto.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")//NOME DA TABELA
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //CHAVE PRIMARIA
	private long id;
	
	@NotNull
	private String nomeCompleto;
	
	@NotNull
	private String email;
	
	@NotNull
	private String senha;
	
	/*RELAÇÃO ENTRE TABELAS* UM USUARIO PODE TER MUITAS POSTAGENS* */
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<PostagemModel> postagem; 
	
	
	//METODOS ESPECIAIS GET E SET
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
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
	public List<PostagemModel> getPostagem() {
		return postagem;
	}
	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	
}
