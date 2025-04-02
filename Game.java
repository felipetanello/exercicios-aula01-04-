package br.com.unicuritiba.CadastroJogos.models;

import java.security.PublicKey;

import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_games")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "preco")
	private String preco;
	
	@Column(name = "desenvolvedora")
	private String desenvolvedora;
	
	@Column(name = "minmemoria")
	private String minmemoria;

	@Column(name = "minespaco")
	private String minespaco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getMinmemoria() {
		return minmemoria;
	}

	public void setMinmemoria(String minmemoria) {
		this.minmemoria = minmemoria;
	}

	public String getMinespaco() {
		return minespaco;
	}

	public void setMinespaco(String minespaco) {
		this.minespaco = minespaco;
	}
	

}