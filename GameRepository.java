package br.com.unicuritiba.CadastroJogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.CadastroJogos.models.Game;

public interface GameRepository 
			extends JpaRepository<Game, Long>{

}
