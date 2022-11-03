package com.radek.andersonhelder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.radek.andersonhelder.entities.Alunos;

public interface AlunosRepository extends JpaRepository<Alunos, Integer>{

	List<Alunos> findAll();
}
