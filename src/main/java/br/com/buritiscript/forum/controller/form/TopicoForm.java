package br.com.buritiscript.forum.controller.form;

import com.sun.istack.NotNull;

import br.com.buritiscript.forum.model.Curso;
import br.com.buritiscript.forum.model.Topico;
import br.com.buritiscript.forum.repository.CursoRepository;

public class TopicoForm {
	@NotNull
	private String titulo;
	private String mensagem;
	private String nomeCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
