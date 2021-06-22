package br.com.buritiscript.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.buritiscript.forum.controller.dto.TopicoDTO;
import br.com.buritiscript.forum.model.Topico;
import br.com.buritiscript.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos/{nomeCurso}")
	public List<TopicoDTO> listar(String nomeCurso){
		
		List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
		
		return TopicoDTO.converter(topicos);
	}
}
