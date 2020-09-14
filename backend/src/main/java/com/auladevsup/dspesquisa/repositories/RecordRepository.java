package com.auladevsup.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auladevsup.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
