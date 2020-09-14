package com.auladevsup.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auladevsup.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
