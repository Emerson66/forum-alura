package br.com.buritiscript.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.buritiscript.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
