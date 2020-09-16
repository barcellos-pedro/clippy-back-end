package com.projetointegrador.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetointegrador.projeto.model.TemaModel;

@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long> {
	public List<TemaModel> findAllByNomeContainingIgnoreCase (String nome);
	public List<TemaModel> findAllByStatusOrderByNomeAsc(boolean status);
}
