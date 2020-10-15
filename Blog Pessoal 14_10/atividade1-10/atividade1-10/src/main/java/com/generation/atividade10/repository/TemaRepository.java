package com.generation.atividade10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.atividade10.model.Tema;

public interface TemaRepository  extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
}
