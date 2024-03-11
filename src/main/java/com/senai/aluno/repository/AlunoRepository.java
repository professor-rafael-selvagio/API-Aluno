package com.senai.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.senai.aluno.entity.Aluno;


public interface AlunoRepository extends CrudRepository<Aluno, Long>{

}
